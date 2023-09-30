package br.com.fipa.ControllerRest;

import java.util.LinkedList;
import java.util.Queue;

import br.com.fiap.labirinto.MazeResquest;
import br.com.fiap.labirinto.Point;
import br.com.fiap.labirinto.findShortestPath;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LabirintoShortestPath {
	
	@PostMapping("/shortest-path")
	public int shortestPath(@RequestBody MazeResquest request) {
	    int[][] maze = request.getMaze();
	    Point start = request.getStart();
	    Point end = request.getEnd();

	    int steps = findShortestPath(maze, start, end);

	    return steps;
}

	public int findShortestPath(int[][] maze, Point start, Point end) {
	    int[] dx = {1, -1, 0, 0};
	    int[] dy = {0, 0, 1, -1};
	    
	    int rows = maze.length;
	    int cols = maze[0].length;
	    boolean[][] visited = new boolean[rows][cols];

	    Queue<Point> queue = new LinkedList<>();
	    queue.offer(start);
	    visited[start.getX()][start.getY()] = true;

	    int steps = 0;

	    while (!queue.isEmpty()) {
	        int size = queue.size();
	        for (int i = 0; i < size; i++) {
	            Point current = queue.poll();
	            if (current.getX() == end.getX() && current.getY() == end.getY()) {
	                return steps;
	            }

	            for (int j = 0; j < 4; j++) {
	                int newX = current.getX() + dx[j];
	                int newY = current.getY() + dy[j];

	                if (isValid(newX, newY, rows, cols) && maze[newX][newY] == 0 && !visited[newX][newY]) {
	                    queue.offer(new Point(newX, newY));
	                    visited[newX][newY] = true;
	                }
	            }
	        }
	        steps++;
	    }

	    return -1; // 
	}

	private boolean isValid(int x, int y, int rows, int cols) {
	    return x >= 0 && x < rows && y >= 0 && y < cols;
	}


}
