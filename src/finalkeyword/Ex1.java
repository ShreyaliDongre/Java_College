package finalkeyword;

public class Ex1 {
    public static void main(String[] args) {
        final int a = 10;
        // a=20; //error: cannot assign a value to final variable a
        System.out.println(a);
        //a=20;
        System.out.println(a);
    }
}
