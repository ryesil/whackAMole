package javaPractice;

public class CylinderRY extends CircleRY{
    private double height;

    CylinderRY(double radius, double height) {
        super(radius);
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * this.getArea();
    }

}