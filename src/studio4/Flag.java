package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	
	public static void main(String[] args) {
		StdDraw.setXscale(0, 20);
		StdDraw.setYscale(0, 10);
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(4, 5, 3, 4);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(10, 5, 3, 4);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(16, 5, 3, 4);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5,5,0.5,5);
		StdDraw.filledRectangle(19.5,5,0.5,5);
		StdDraw.filledRectangle(10,0.5,9,0.5);
		StdDraw.filledRectangle(10,9.5,9,0.5);
		
	}
}