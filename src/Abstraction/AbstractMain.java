package Abstraction;

public class AbstractMain {
    public static void main(String[] args) {
        Animal a1;
        a1 = new Tiger(); //Tiger t1
        a1.eat();
        a1 = new Goat(); //Goat g1
        a1.eat();
    }
}
