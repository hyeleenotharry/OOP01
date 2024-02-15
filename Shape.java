package OOP01;

/**
 * The Shape class represents a basic geometric shape with width and height.
 */

public class Shape {
	
	/**
     * The width of the shape.
     */
	public int width;
	
	/**
     * The height of the shape.
     */
	public int height;
	
	/**
     * Default constructor for the Shape class.
     */
	public Shape(){
		
	}
	
	/**
     * Parameterized constructor for the Shape class.
     *
     * @param width  The width of the shape.
     * @param height The height of the shape.
     */
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	 /**
     * Draw the shape and print its dimensions.
     */
	public void draw() {
		System.out.println("Shape " + width + "x" + height);
	}

}
