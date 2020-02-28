
public class SnakeGame {
	private boolean gameboard[][];
	private int position[];
	private static int recursiveCounter;
	private static int exhaustiveCounter;
	public SnakeGame() {
		this.gameboard = new boolean[1][1];
		this.recursiveCounter=0;
		this.exhaustiveCounter=0;
	}
	
	public SnakeGame(boolean[][]gameboard,int x,int y) {
		this.gameboard=gameboard;
		position[0]=x;
		position[1]=y;
		this.exhaustiveCounter=0;
		this.recursiveCounter=0;
		
	}
	
	
	private static int exhaustiveChecks;
	
	private static int recursiveChecks;
	
	public int[] findTailExhaustive() {
		exhaustiveCounter++;
		int neighbors=0;
		int [] results = {0,0,0};
		for(int i=0; i<gameboard.length;i++) {
			for(int j=0; j<gameboard.length;j++) {
				neighbors=0;
				if(gameboard[i][j]) {
					results[2]++;
					if((i-1)>=0&&(j-1)>=0&&gameboard[i-1][j-1]){
					neighbors++;
					}
					if((i-1)>=0&&gameboard[i-1][j]){
					neighbors++;
					}
					if((j-1)>=0&&gameboard[i][j-1]){
					neighbors++;
					}
					if((i+1)<gameboard.length&&(j+1)<gameboard.length&&gameboard[i+1][j+1]){
					neighbors++;
					}
					if((i+1)<gameboard.length&&gameboard[i+1][j]){
					neighbors++;
					}
					if((j+1)<gameboard.length&&gameboard[i][j+1]){
					neighbors++;
					}
					if((i-1)>=0&&(j+1)<gameboard.length&&gameboard[i-1][j+1]){
					neighbors++;
					}
					if((i+1)<gameboard.length&&(j-1)>=0&&gameboard[i+1][j-1]){
					neighbors++;
						}
				}
		if((neighbors==1)&&(!(position[0]==i)&&(position[1]==j))){
			results[0]=i;
			results[1]=j;
			}
		}
			}
		return results;
	}
	public int[] findTailRecursive() {
		recursiveCounter++;
		int [] neighbor = new int [2];
		int [] results = {0,0,0};
		if((position[0]+1)<gameboard.length&&gameboard[position[0]+1][position[1]]) {
			neighbor[0]=position[0]+1;
			neighbor[1]=position[1];
		}
		if((position[1]+1)<gameboard.length&&gameboard[position[0]][position[1]+1]) {
			neighbor[0]=position[0];
			neighbor[1]=position[1]+1;
		}
		if((position[0]-1)>=0&&gameboard[position[0]-1][position[1]]) {
			neighbor[0]=position[0]-1;
			neighbor[1]=position[1];
		}
		if((position[1]-1)>=0&&gameboard[position[0]][position[1]-1]) {
			neighbor[0]=position[0];
			neighbor[1]=position[1]-1;
		}
		int [] tail = findTailRecursive(neighbor,position);
		tail[2]++;
		return results;
	}
	
	private int[] findTailRecursive(int[] currentPosition, int[] previousPosition) {
		recursiveCounter++;
		int [] neighbor = new int [2];
		int [] results = {0,0,0};
		if((currentPosition[0]+1)<gameboard.length&&gameboard[currentPosition[0]+1][currentPosition[1]]&&(!(currentPosition[0]+1==previousPosition[0]&&currentPosition[1]==previousPosition[1]))) {
			neighbor[0]=currentPosition[0]+1;
			neighbor[1]=currentPosition[1];
		}
		if((currentPosition[1]+1)<gameboard.length&&gameboard[currentPosition[0]][currentPosition[1]+1]&&(!(currentPosition[0]==previousPosition[0]&&currentPosition[1]+1==previousPosition[1]))) {
			neighbor[0]=currentPosition[0];
			neighbor[1]=currentPosition[1]+1;
		}
		if((currentPosition[0]-1)>=0&&gameboard[currentPosition[0]-1][currentPosition[1]]&&(!(currentPosition[0]-1==previousPosition[0]&&currentPosition[1]==previousPosition[1]))) {
			neighbor[0]=currentPosition[0]-1;
			neighbor[1]=currentPosition[1];
		}
		if((currentPosition[1]-1)>=0&&gameboard[currentPosition[0]][currentPosition[1]-1]&&(!(currentPosition[0]==previousPosition[0]&&currentPosition[1]-1==previousPosition[1]))) {
			neighbor[0]=currentPosition[0];
			neighbor[1]=currentPosition[1]-1;
		}
		int [] tail = findTailRecursive(neighbor,currentPosition);
		tail[2]++;
		return results;
	}
	
	private void resetCounters() {
		this.exhaustiveCounter=0;
		this.recursiveCounter=0;
	}
	
	private static int getRecursiveChecks() {
		 return exhaustiveCounter;
	}
	
	private static int getExhaustiveChecks() {
		return recursiveCounter;
	}
}
