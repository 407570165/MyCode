package slide.com;

import java.util.Scanner;

public class TestGeometricObject {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String color =scanner.nextLine();
        RectangleFromSimpleGeometricObjects rs =new
                RectangleFromSimpleGeometricObjects(2,4);
        rs.getArea();
        rs.toString();
        System.out.println(rs.getPerimeter());
        RectangleFromSimpleGeometricObjects rectangleFromSimpleGeometricObjects=new
                RectangleFromSimpleGeometricObjects(3,5,color,true);
        System.out.println(rectangleFromSimpleGeometricObjects.toString());
    }
}
