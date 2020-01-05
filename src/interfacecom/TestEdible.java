package interfacecom;

public class TestEdible {
    public static void main(String[] args) {
            Object object[]= {new Tiger(),new chicken(),new Apple()};
            for (int i =0;i<object.length;i++){
                if (object[i]instanceof Edible)
                    System.out.println(((Edible)object[i]).howToEat());
                if (object[i]instanceof Animal)
                    System.out.println(((Animal)object[i]).sound());
            }
    }
}
abstract class Animal{
    public abstract String sound();
}
class chicken extends Animal implements Edible{
    public String sound(){
        return "coo coo";
    }
    public String howToEat(){
        return "fried";
    }
}
class Tiger extends Animal{
    public String sound(){
        return "huhuhu";
    }
}
abstract class Fruit implements Edible {
// Data fields, constructors, and methods omitted here
}
class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}
class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}
