package zyh.JAVABasic.OOP.ManyShape.earx5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 15:15
 * \
 */
public class GeometricTest {
    public void equalsArea(GeometricObject go,GeometricObject go2){
        //利用的是多态，传的对象是谁就调用谁的findArea方法
        System.out.println(go.findArea(  )==go2.findArea(  ));

    }
    public void displayGeometricObejct(GeometricObject go){
        System.out.println(go.findArea());
    }
    public static void main(String[] args) {
        GeometricObject g=new GeometricObject( "red",10);
        Circle c=new Circle( "red",1.0,1.0 );
//        MyRectangle my=new MyRectangle( "blue",1.0,1.0 )
        g.findArea(  );
        GeometricTest test=new GeometricTest();
    }
}
class GeometricObject{
    protected  String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
    return 0;
    }
}

class Circle extends GeometricObject{
    double radius;

    public Circle(String color, double weight, double radius) {
        super( color, weight );
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}

class MyRectangle extends GeometricObject{
    double width;
    double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super( color, weight );
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width*height;
    }
}