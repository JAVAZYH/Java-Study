package Basic.OOP.Contructor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 14:04
 * \
 */
public class TriAngle {
    TriAngle(){
    }
    TriAngle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (base*height)/2;
    }
    private double base;
    private double height;
}