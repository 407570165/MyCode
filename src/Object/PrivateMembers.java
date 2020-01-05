package Object;

public class PrivateMembers {
    public static void main(String[] args) {
        System.out.println(PrivateStaticMembers.getNumberOfObjects());
        PrivateStaticMembers ps =new PrivateStaticMembers();
        ps.getNumberOfObjects();
        System.out.println(ps.radius);
    }
}
