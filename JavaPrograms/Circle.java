public class Circle {
    
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    } 

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }
}
