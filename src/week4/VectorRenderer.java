package week4;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius + " with vector graphics.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square with side " + side + " with vector graphics.");
    }
}
