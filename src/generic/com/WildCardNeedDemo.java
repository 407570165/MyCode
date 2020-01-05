package generic.com;

public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Number> inStack =new GenericStack();
        inStack.push(0.5);
        inStack.push(1);
        inStack.push(-2);
        System.out.println(max(inStack));
    }
    public static double max(GenericStack<Number> stack){
        double max =stack.pop().doubleValue();
        while (!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            if (value>max)
            max =value;
        }
        return max;
    }
}
