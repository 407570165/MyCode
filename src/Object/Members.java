package Object;

public class Members {
    public static void main(String[] args) {
        System.out.println(StaticMembers.getNumberOfObjects());
        StaticMembers sm =new StaticMembers();
        //System.out.println(sm.radius);
        StaticMembers sms =new StaticMembers(20);
        System.out.println(sms.radius+" "+StaticMembers.getNumberOfObjects());

    }
}
