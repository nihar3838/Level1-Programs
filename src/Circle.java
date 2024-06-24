
public class Circle {
    float radius;

    public float AreaOfCircle (float radius){
        return (float)(3.14*radius*radius);
    }
    public float CircumferenceOfCircle(float radius){
        return (float) (2 * 3.14 * radius);
    }

    public static void main(String[] args) {
        Circle obj1 =new Circle();
        System.out.println("Area of circle is "+obj1.AreaOfCircle(10));
        System.out.println("Circumference of circle is"+obj1.CircumferenceOfCircle(10));
    }
}
