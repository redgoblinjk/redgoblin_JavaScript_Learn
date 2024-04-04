public class TestCircle {
    public static void main(String [] args) {
        
        Circle myCircle = new Circle(5,"red");
        Circle myCircle1 = new Circle(6,"blue");

        System.out.printf("Color of circle is %s \n.", myCircle.getColor());
        System.out.printf("Color of circle1 is %s \n.", myCircle1.getColor());
        System.out.printf("Radius of circle is %f \n.", myCircle.getRadius());
        System.out.printf("Radius of circle 1 is %f \n.",myCircle1.getRadius());


        myCircle.setColor("purple"); 
        myCircle.setRadius(5.5566); 
        myCircle1.setColor("green"); 
        myCircle1.setRadius(6.6655); 
        
        System.out.printf("Color of circle is %s \n.", myCircle.getColor());
        System.out.printf("Color of circle1 is %s \n.", myCircle1.getColor());
        System.out.printf("Radius of circle is %f \n.", myCircle.getRadius());
        System.out.printf("Radius of circle 1 is %f \n.",myCircle1.getRadius());

    }
}
