package StaticKeyword;

public class Counter {
    static int count = 0;
    public Counter(){
        count++;
    }
    public static void show(){
        System.out.println("Counter is: " + count);
    }
}
