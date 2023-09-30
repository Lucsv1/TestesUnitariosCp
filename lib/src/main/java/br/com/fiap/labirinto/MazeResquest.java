package br.com.fiap.labirinto;



public class MazeResquest {
	
	private int[][] maze;
    private Point start;
    private Point end;
	public int[][] getMaze() {
		return maze;
	}
	public void setMaze(int[][] maze) {
		this.maze = maze;
	}
	public Point getStart() {
		return start;
	}
	public void setStart(Point start) {
		this.start = start;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}

}
