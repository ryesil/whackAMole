package javaPractice.ry;

public class CuboidRY extends RectangleRY{
    private double height;

    public CuboidRY(double width, double length, double height) {
        super(width, length);
        this.height = height > 0 ? height : 0;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }
}