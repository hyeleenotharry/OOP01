package OOP01;

public class Rectangle extends OOP01.Shape{
	public Rectangle() {
		
	}
	
	/**
     * Parameterized constructor for the Rectangle class.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
	public Rectangle(int width, int height) {
		super(width, height);
		
	}
	
	/**
     * Draw the rectangle and print its dimensions.
     * Overrides the draw method in the Shape class to provide specific behavior for rectangles.
     */
    @Override
	public void draw() {
		System.out.println("RECTANGLE " + width + "x" + height);
	}
}
