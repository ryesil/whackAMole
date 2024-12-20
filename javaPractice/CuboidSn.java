package javaPractice;

public class CuboidSn extends RectangleSn {
    private double height;

    public CuboidSn(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
