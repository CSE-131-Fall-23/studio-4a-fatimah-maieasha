package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File
		String shape = in.next();
		if (shape.equals("rectangle")) {
			int r = in.nextInt();
			int g = in.nextInt();
			int b = in.nextInt();
			boolean filled = in.nextBoolean();

			Color color = new Color(r, g, b);
			StdDraw.setPenColor(color);
			double w = in.nextDouble();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double z = in.nextDouble();
			if (filled) {
				StdDraw.filledRectangle(w, x, y, z);

			} else {
				StdDraw.rectangle(w, x, y, z);
			}

		}
		if (shape.equals("ellipse")) {
			int r = in.nextInt();
			int g = in.nextInt();
			int b = in.nextInt();
			boolean filled = in.nextBoolean();

			Color color = new Color(r, g, b);
			StdDraw.setPenColor(color);
			double w = in.nextDouble();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double z = in.nextDouble();
			if (filled) {
				StdDraw.filledEllipse(w, x, y, z);

			} 
			else {
				StdDraw.ellipse(w, x, y, z);
			}
			if (shape.equals("triange")) {
				int r1 = in.nextInt();
				int g1 = in.nextInt();
				int b1 = in.nextInt();
				boolean filled1 = in.nextBoolean();

				Color color1 = new Color(r, g, b);
				StdDraw.setPenColor(color);
				double w1 = in.nextDouble();
				double x1 = in.nextDouble();
				double y1 = in.nextDouble();
				double z1 = in.nextDouble();
				double a1 = in.nextDouble();
				double b0 = in.nextDouble();
				
				double [] xaxis = {w1, y1, a1};
				double [] yaxis = {x1, z1, b0};
				
				if (filled) {
					StdDraw.filledPolygon(xaxis, yaxis);

				} 
				else {
					StdDraw.polygon(xaxis, yaxis);
				}
	}}
}}
