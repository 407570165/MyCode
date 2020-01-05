package Object;

public class TestPastObjects {
    public static void main(String[] args) {
        PrivateStaticMembers ps =new PrivateStaticMembers();
        int n =5;
        printArea(n,ps);
        System.out.println("Radius is:"+ps.radius);
        System.out.println("n is :"+n);
    }
    public static void printArea(int time ,PrivateStaticMembers c){
        System.out.println("Radius\t\tArea");
        while (time>=1){
            System.out.println(c.getRadius()+"  "+c.getArea());
            c.setRadius((c.getRadius()+1));
            time--;
        }
    }
}
