package Exception;

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c3 =new CircleWithException(0);
            CircleWithException c1 =new CircleWithException(5);
            CircleWithException c2 =new CircleWithException(-5);

        }catch (IllegalArgumentException iae){
            System.out.println(iae);
        }
        System.out.println("Number of objects created: " +
                CircleWithException.getNumberOfObjects());
    }
}
