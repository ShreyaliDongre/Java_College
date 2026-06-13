package Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        B b1 = new B();
        b1.showB();
        b1.showA();

        C c1 = new C();
        c1.showC();
        c1.showA();
    }
}
