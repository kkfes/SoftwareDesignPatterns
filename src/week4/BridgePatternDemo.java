package week4;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);
        Shape square = new Square(rasterRenderer, 10);

        circle.draw();  // Vector circle
        square.draw();  // Raster square
    }
}