package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color lightBlue = new Color(137, 207, 240);
		Color coral = new Color(255, 178, 127);
		Color mintGreen = new Color(189, 252, 201);
		
		StdDraw.setPenColor(mintGreen);
		StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.25);
		
		StdDraw.setPenColor(coral);
		StdDraw.setPenRadius(0.025);
		StdDraw.line(0.25, 0.75, 0.25, 0.25);
		StdDraw.line(0.75, 0.75, 0.75, 0.25);
		
		StdDraw.line(0.15, 0.25, 0.85, 0.25);
		StdDraw.line(0.15, 0.75, 0.85, 0.75);
		
		StdDraw.setPenColor(lightBlue);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
	}
}