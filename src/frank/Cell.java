package frank;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Cell {
	private double x, y, width;
	private GraphicsContext gc;
	private boolean walls [] = {true, true, true, true};
	private boolean visited = false;
	
	public Cell(GraphicsContext gc, int width) {
		this.gc = gc;
		this.width = width;
	}
	
	public void show() {
		if (visited) {
			gc.setFill(Color.rgb(100, 0, 100));
			gc.fillRect(x, y, width, width);
		}
		
		gc.setStroke(Color.rgb(255, 255, 255));
		//oben, rechts, unten, links
		if (walls[0]) {
			gc.strokeLine(x, y, x + width, y);
		}
		
		if (walls[1]) {
			gc.strokeLine(x + width, y, x + width, y + width);
		}
		
		if (walls[2]) {
			gc.strokeLine(x + width, y + width, x, y + width);
		}
		
		if (walls[3]) {
			gc.strokeLine(x, y + width, x, y);
		}
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public void setWall(boolean val, int index) {
		walls[index] = val;
	}
	
	public boolean getWall(int index) {
		return walls[index];
	}
	
	public void highlight() {
		gc.setFill(Color.rgb(255, 0, 255));
		gc.fillRect(x, y, width, width);
	}
}
