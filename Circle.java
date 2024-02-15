package OOP01;

public class Circle extends OOP01.Oval{
	public Circle() {
		
	}
	
	
	/**
     * Parameterized constructor for the Circle class.
     *
     * @param width The diameter of the circle.
     */
	public Circle(int width, int height) {
		super(width, height);
		
	}
	
	/**
     * Draw the circle and print its dimensions.
     * Overrides the draw method in the Oval class to provide specific behavior for circles.
     */
    @Override
	public void draw() {
		System.out.println("CIRCLE " + width);
	}

}
