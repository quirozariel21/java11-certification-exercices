public class Sudoku {
	
	static int[][] game;

	public static void main(String[] args){
		game[3][3] = 6;
		Object[]  obj = game;
		game[3][3] = "x"; // The code does not compile because cannot assign a string
		System.out.println(game[3][3]);
	}
}