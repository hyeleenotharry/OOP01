package OOP01;

/**
 * The Oval class represents an oval shape, which is a subclass of the Shape class.
 */
public class Oval extends OOP01.Shape{
	public Oval() {
		
	}
	
	/**
     * Parameterized constructor for the Oval class.
     *
     * @param width  The width of the oval.
     * @param height The height of the oval.
     */
	public Oval(int width, int height) {
		super(width, height);
		
	}
	
	
	/**
     * Draw the oval and print its dimensions.
     * Overrides the draw method in the Shape class to provide specific behavior for ovals.
     */
    @Override
	public void draw() {
		System.out.println("OVAL " + width + "x" + height);
	}
}
