package Object;

import org.w3c.dom.ls.LSOutput;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle.getArea());
        circle.setRadius(2);
        System.out.println(circle.getArea());

    }
}
class Circle{
    double radius;
            Circle(){
                radius=1;
            }
            Circle(double newRadius){
                radius =newRadius;
            }
            double getArea(){
                    return radius*radius*Math.PI;
            }
            double getPerimeter(){
                return  radius*2*Math.PI;
            }
            void setRadius(double newRadius){
                radius=newRadius;
            }
        }

