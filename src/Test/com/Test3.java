package Test.com;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double[] data = new double[4];
            for (int i = 0; i < 4; i++) {
                data[i] = scanner.nextDouble();
            }
            Complex c1 = new Complex(data[0], data[1]);
            Complex c2 = new Complex(data[2], data[3]);
            Complex c3 = new Complex();
            c3 = c1.add(c2);
            c1.toString();
            c3.toString();
            System.out.println("("+c1.toString() + ") + (" + c2.toString()+ ") = " +c3.toString());
            c3=c1.subtract(c2);
            System.out.println("("+c1.toString() + ") - (" + c2.toString()+ ") = " +c3.toString());
            c3=c1.multiply(c2);
            System.out.println("("+c1.toString() + ") * (" + c2.toString()+ ") = " +c3.toString());
            c3=c1.divide(c2);
            System.out.println("("+c1.toString() + ") / (" + c2.toString()+ ") = " +c3.toString());
            c3=c1.abs(c2);
            System.out.println("|"+c1.toString()+"| = "+c3.toString() );
            System.out.println("");
        }
    }
}
class  Complex implements Cloneable{
    double a;
    double b;
    String ans;
    Complex(){
    }
    Complex(double a,double b){
        this.a=a;
        this.b=b;
    }
    public String toString(){
        String tmpA = String.format("%.4f", a);
        String tmpB=String.format("%.4f",b);
        if(tmpB.equals("0.0000"))
            return tmpA;
        if (tmpA.equals(("0.0000")))
            return tmpB+"i";
        return tmpA+" + "+tmpB+"i";
    }
    public Complex add(Complex rhs){
        Complex ans = new Complex();
        ans.a = a + rhs.a;
        ans.b = b + rhs.b;
        return ans;
    }
    public Complex subtract(Complex rhs){
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
