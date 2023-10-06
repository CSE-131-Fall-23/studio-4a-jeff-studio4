package studio4;

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
		Scanner in = new Scanner(f); //making Scanner with a File
		
			String name = in.next();
			if (name.length()==7)
			{
				int R = in.nextInt();
				int G = in.nextInt();
				int B = in.nextInt();
				boolean figure = in.nextBoolean();
				double x = in.nextDouble();
				double y = in.nextDouble();
				double a = in.nextDouble();
				double b = in.nextDouble();
				StdDraw.setPenColor(R,G,B);
				if (figure == false)
				{
					StdDraw.ellipse(x,y,a,b);
				}
				else
				{
					StdDraw.filledEllipse(x,y,a,b);
				}
			}
			else if (name.length()==9)
			{
				int R = in.nextInt();
				int G = in.nextInt();
				int B = in.nextInt();
				boolean figure = in.nextBoolean();
				double x = in.nextDouble();
				double y = in.nextDouble();
				double a = in.nextDouble();
				double b = in.nextDouble();
				StdDraw.setPenColor(R,G,B);
				if (figure == false)
				{
					StdDraw.rectangle(x,y,a,b);
				}
				else
				{
					StdDraw.filledRectangle(x,y,a,b);
				}
			}
			else
			{
				int R = in.nextInt();
				int G = in.nextInt();
				int B = in.nextInt();
				boolean figure = in.nextBoolean();
				double x1 = in.nextDouble();
				double y1 = in.nextDouble();
				double x2 = in.nextDouble();
				double y2 = in.nextDouble();
				double x3 = in.nextDouble();
				double y3 = in.nextDouble();
				StdDraw.setPenColor(R,G,B);
				if (figure == false)
				{
					StdDraw.line(x1,y1,x2,y2);
					StdDraw.line(x1,y1,x3,y3);
					StdDraw.line(x2,y2,x3,y3);
				}
				else
				{
					double[] x = {x1,x2,x3};
					double[] y = {y1,y2,y3};
					StdDraw.filledPolygon(x,y);
				}
			}
		
	}
}
