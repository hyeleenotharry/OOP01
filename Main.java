package OOP01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The Main class contains the main method to draw the Canvas class and display the shapes on the canvas.
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
	     * The main method, which is the entry point of the program.
	     *
	     * @param args The command-line arguments (not used in this program).
	     */
		Canvas c = new Canvas();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Shape " + (i + 1) + ": ");
			c.sp[i].draw();
		}
			
		}

}
