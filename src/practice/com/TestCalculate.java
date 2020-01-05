package practice.com;

import baby.com.Comp;

import java.util.Scanner;

public class TestCalculate {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNext()) {
            double d[] = new double[4];
            for (int i = 0; i < 4; i++) {
                d[i] = scanner.nextDouble();
            }
            Complex c1 = new Complex(d[0], d[1]);
            Complex c2 = new Complex(d[2], d[3]);
            Complex c3 = new Complex();
            c3 = c1.add(c2);
            System.out.println("(" + c1.toString() + " ) + (" + c2.toString() + ") = " + c3.toString());
            c3 = c1.subtract(c2);
            System.out.println("(" + c1.toString() + " ) - (" + c2.toString() + ") = " + c3.toString());
            c3 = c1.multiply(c2);
            System.out.println("(" + c1.toString() + " ) * (" + c2.toString() + ") = " + c3.toString());
            c3 = c1.divide(c2);
            System.out.println("(" + c1.toString() + " ) / (" + c2.toString() + ") = " + c3.toString());
            c3 = c1.abs(c2);
            System.out.println("|" + c1.toString() + "| = " + c3.toString());
            System.out.println("");
        }
    }
}
class Complex implements Cloneable{
    double a;
    double b;
    Complex(){
    }
    Complex(double a,double b){
        this.a=a;
        this.b=b;
    }
    public String toString(){
        String tempa =String.format("%.4f",a);
        String tempb =String.format("%.4f",b);
        if (tempb.equals("0.0000"))
            return tempa;
        if (tempa.equals("0.0000"))
            return tempb;
        return tempa+" + "+tempb+"i";
    }
    public Complex add(Complex rhs){
        Complex ans =new Complex();
        ans.a=a+rhs.a;
        ans.b=b+rhs.b;
        return ans;
    }
    public Complex  subtract(Complex rhs){
        Complex ans =new Complex();
        ans.a=a-rhs.a;
        ans.b=b-rhs.b;
        return ans;
    }
    public Complex multiply(Complex rhs){
        Complex ans =new Complex();
        ans.a=a*rhs.a-b*rhs.b;
        ans.b=b*rhs.a+a*rhs.b;
        return ans;
    }
    public Complex divide(Complex rhs){
        Complex ans =new Complex();
        ans.a=(a*rhs.a+b*rhs.b)/(rhs.a*rhs.a+rhs.b*rhs.b);
        ans.b=(rhs.a*b-a*rhs.b)/(rhs.a*rhs.a+rhs.b*rhs.b);
        return ans;
    }
    public Complex abs(Complex rhs){
        Complex ans =new Complex();
        ans.a=Math.pow(a*a+b*b,0.5);
        ans.b=0;
        return ans;
    }
}