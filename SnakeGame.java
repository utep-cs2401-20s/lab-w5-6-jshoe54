
public class SnakeGame {
	private boolean gameboard[][];
	private int position[];
	
	public SnakeGame() {
		this.gameboard = new boolean[1][1];
	}
	
	public SnakeGame(boolean[][]gameboard,int x,int y) {
		this.gameboard=gameboard;
		position[0]=x;
		position[1]=y;
		
	}
	
	
	private static int exhaustiveChecks;
	
	private static int recursiveChecks;
	
	public int[] findTailExhaustive() {
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
		int neighbors=0;
		int [] results = {0,0,0};
		//starts at head? at indecies [i][j]
		int position[i][j];
			if(gameboard[i][j]) {
				results[2]++;
				if((i-1)>=0&&gameboard[i-1][j]){
					neighbors++;
				}
				if((j-1)>=0&&gameboard[i][j-1]){
					neighbors++;
				}
				if((i+1)<gameboard.length&&gameboard[i+1][j]){
						neighbors++;
				}
				if((j+1)<gameboard.length&&gameboard[i][j+1]){
						neighbors++;
				}
			}
			if((neighbors==1)&&(!(position[0]==i)&&(position[1]==j))){
				results[0]=i;
				results[1]=j;
				}
		return results;
			findTailRecursive();
	}
	
	private int[] findTailRecursive(int[] currentPosition, int[] previousPosition) {
		
	}
	
	private void resetCounters() {
		
	}
	
	private static int getRecursiveChecks() {
		
	}
	
	private static int getExhaustiveChecks() {
		
	}
}
