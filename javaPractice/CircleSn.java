package javaPractice;

public class CircleSn {
    private double radius;

    public CircleSn(double radius) {
       this.radius  = radius<0? 0: radius;
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public CircleSn setRadius(double radius) {
        this.radius = radius;
        return this;
    }
}
