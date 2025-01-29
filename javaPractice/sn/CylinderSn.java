package javaPractice.sn;

public class CylinderSn extends CircleSn {
    private double height;

    public CylinderSn(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
