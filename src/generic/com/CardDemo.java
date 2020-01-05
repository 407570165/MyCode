package generic.com;

public class CardDemo {
    public static void main(String[] args) {
        GenericStack inStack =new GenericStack();
        inStack.push(1);
        inStack.push(2);
        inStack.push(-2);
        print(inStack);
    }
    public static void print(GenericStack stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }
}
