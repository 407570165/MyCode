package generic.com;

import javafx.scene.web.WebHistory;

public class SuperCardDemo {
    public static void main(String[] args) {
        GenericStack stack1 =new GenericStack();
        GenericStack stack2 =new GenericStack();
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");
        add(stack1,stack2);
        CardDemo.print(stack2);//why 可以直接不用new 直接使用
    }
    public static <E> void add(GenericStack<E> stack1,GenericStack<? super E>stack2){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}
