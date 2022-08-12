public class circle extends GeometricObject {
    private double radius;

    public circle(){
        this(10.5)
    }

    public circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
