package Inheritance;

public class Multilevel {
    public static void main(String[] args) {
        C c1 = new C();
        c1.showC();
        c1.showB();
        c1.showA();
        D d1 = new D();
        d1.showD();
        d1.showC();
        d1.showB();
        d1.showA();
    }
}
