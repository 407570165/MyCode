package Exception;
//unfinished
public class TestCircleWithCustomException {
    public static void main(String[] args) {

    }
}
class CircleWithCustomException {
        private  double radius;
        private static int numberOfObjects=0;
        CircleWithCustomException() throws InvalidRadiusException{
            this(1.0);
        }
        CircleWithCustomException(double newRadius){

        }
}
