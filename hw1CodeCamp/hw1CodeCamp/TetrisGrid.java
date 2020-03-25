//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = new boolean[grid.length][grid[0].length];

		for(int y = 0; y < grid[0].length; y++){
			for(int x = 0; x < grid.length; x++){
				this.grid[x][y] = grid[grid.length - x - 1][grid[0].length - y - 1];
				System.out.print(this.grid[x][y] + " ");
			}
			System.out.print('\n');
		}
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		for(int y = 0; y < this.grid.length; y++){
			boolean cmp = grid[]
			for(int x = 0; x < this.grid[0].length; x++){

			}
		}
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return this.grid; // YOUR CODE HERE
	}
}
