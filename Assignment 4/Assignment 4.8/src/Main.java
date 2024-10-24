// Main.java
public class Main {
    public static void main(String[] args) {
        // Create shapes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        // Create a drawing and add shapes
        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        // Create an AreaCalculator visitor
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate the areas of all shapes in the drawing
        System.out.println("Calculating areas:");
        drawing.calculateAreas(areaCalculator);
    }
}
