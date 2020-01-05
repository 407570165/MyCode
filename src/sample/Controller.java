package sample;

public class Controller {
    public static void main(String[] args) {
        A a =new A();
        a.p(10);
        a.p(10.0);
    }
}
class  b{
    public void p(double i){
        System.out.println(i*2);
    }
}
class A extends b{
    public void p(double i){
        System.out.println(i);
    }
}
