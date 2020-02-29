import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class SnakeGameTester {
	
	@Test
	public void testFindTailExhaustive1() {
		boolean o=true;//snake body
		boolean f=false;//empty space
		boolean [][] game= {//made up gameboard 
		{f,f,f,f,f},
		{f,o,o,o,f},
		{f,o,f,f,f},
		{f,o,o,o,f},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 1,y= 3);//where the head starts
		int [] result = sol.findTailExhaustive();
		int [] retrn = new int [3];
		retrn[0] = 3;//x coordinate for tail
		retrn[1] = 3;//y coordinate for tail
		retrn[2] = 6;//length of snake
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailExhaustive2() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{f,f,f,f,f},
		{f,o,f,f,f},
		{f,f,f,f,f},
		{f,o,o,o,f},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 1,y= 1);
		int [] result = sol.findTailExhaustive();
		int [] retrn = new int [3];
		retrn[0] = 1;
		retrn[1] = 1;
		retrn[2] = 3;
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailExhaustive3() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{f,f,f,f,f},
		{f,o,o,o,f},
		{f,f,o,f,f},
		{f,o,o,o,f},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 1,y= 3);
		int [] result = sol.findTailExhaustive();
		int [] retrn = new int [3];
		retrn[0] = 3;
		retrn[1] = 3;
		retrn[2] = 7;
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailExhaustive4() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{f,f,f,f,o},
		{f,o,o,o,f},
		{f,o,f,f,f},
		{f,o,o,o,f},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 0,y= 4);
		int [] result = sol.findTailExhaustive();
		int [] retrn = new int [3];
		retrn[0] = 3;
		retrn[1] = 3;
		retrn[2] = 8;
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailExhaustive5() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{o,o,o,o,o},
		{o,o,o,o,o},
		{o,o,o,o,o},
		{o,o,o,o,o},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 0,y= 0);
		int [] result = sol.findTailExhaustive();
		int [] retrn = new int [3];
		retrn[0] = 3;
		retrn[1] = 4;
		retrn[2] = 20;
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailRecursive1() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{f,f,f,f,f},
		{f,o,o,o,f},
		{f,o,f,f,f},
		{f,o,o,o,f},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 1,y= 3);
		int [] result = sol.findTailRecursive();
		int [] retrn = new int [3];
		retrn[0] = 3;
		retrn[1] = 3;
		retrn[2] = 6;
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailRecursive2() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{f,o,f,f,f},
		{f,o,f,f,f},
		{f,o,f,f,f},
		{f,o,f,f,f},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 0,y= 1);
		int [] result = sol.findTailRecursive();
		int [] retrn = new int [3];
		retrn[0] = 3;
		retrn[1] = 1;
		retrn[2] = 4;
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailRecursive3() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{o,o,o,o,o},
		{o,f,f,f,f},
		{o,f,f,f,f},
		{o,o,o,o,o},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 3,y= 4);
		int [] result = sol.findTailRecursive();
		int [] retrn = new int [3];
		retrn[0] = 0;
		retrn[1] = 4;
		retrn[2] = 12;
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailRecursive4() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{f,f,f,f,f},
		{f,f,f,f,f},
		{f,o,f,f,f},
		{f,f,f,f,f},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 2,y= 1);
		int [] result = sol.findTailRecursive();
		int [] retrn = new int [3];
		retrn[0] = 2;
		retrn[1] = 1;
		retrn[2] = 1;
		assertArrayEquals(retrn,result);
	}
	@Test
	public void testFindTailRecursive5() {
		boolean o=true;
		boolean f=false;
		boolean [][] game= {
		{f,f,f,f,f},
		{f,f,f,f,f},
		{f,f,f,f,f},
		{f,f,f,f,f},		
		};
		int y;
		int x;
		SnakeGame sol = new SnakeGame(game, x= 1,y= 3);
		int [] result = sol.findTailRecursive();
		int [] retrn = new int [3];
		retrn[0] = 3;
		retrn[1] = 3;
		retrn[2] = 6;
		assertArrayEquals(retrn,result);
	}
}
