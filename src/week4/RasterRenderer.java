package week4;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius " + radius + ".");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing pixels for a square with side " + side + ".");
    }
}