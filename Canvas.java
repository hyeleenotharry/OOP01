package OOP01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

/**
 * The Canvas class represents a canvas that can hold a collection of different shapes.
 */
public class Canvas {

	/**
     * Random number generator for creating random shapes.
     */
	Random random = new Random();
	
	/**
     * Array to store shapes on the canvas.
     */
	Shape[] sp = new Shape[10];
	
	/**
     * Temporary variable to hold a shape during the creation process.
     */
	Shape s = new Shape();
	
	/**
     * Counter to keep track of the number of shapes added to the canvas.
     */
	int cnt = 0;
	
	/**
     * Default constructor for the Canvas class.
     * Initializes the canvas by randomly creating and adding shapes until 10 shapes are added.
     */
	public Canvas() {
		while(true){
			if (cnt == 10) {
				break;
			}
			
			int i = random.nextInt(4);
			int w = random.nextInt(100);
			int h = random.nextInt(100);
			
			if(i == 0) {
				s = new Circle(w, h);
			} else if (i == 1) {
				s = new Oval(w, h);
			} else if (i == 2) {
				s = new Rectangle(w, h);
			} else {
				s = new Square(w, h);
			}
			if (!Arrays.asList(sp).contains(s)) {
				sp[cnt] = s;
				cnt++;
			} 
			
		}
	}
	
	
}
