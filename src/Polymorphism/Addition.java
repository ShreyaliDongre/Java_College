package Polymorphism;

public class Addition {
    public void add(int a, int b){
        int c = a+b;
        System.out.println("The sum of 2 numbers is: "+c);
    }
    public void add(int a, int b, int c){
        int d = a+b+c;
        System.out.println("The sum of 3 numbers is: "+d);
    }
     public void add(double a, double b){
        double c = a+b;
        System.out.println("The sum of 2 numbers is: "+c);
    }
     public void add(double a, double b, double c){
        double d = a+b+c;
        System.out.println("The sum of 3 numbers is: "+d);
    }
}
