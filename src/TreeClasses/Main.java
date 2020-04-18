package TreeClasses;

public class Main {

    public static void main(String[] args) {

        A a = new A(5);

        B b = new B(5, 10);

        C c = new C(5, 10, 15);

        /*
        Write a program that consists of three classes, A, B, and C, such that B extends
A and C extends B. Each class should define an instance variable named "x"
(that is, each has its own variable named x). Describe a way for a method in C to
access and set A's version of x to a given value, without changing B or C's
version. 
         */
        c.setXInAVersion(50);
        System.out.println(c.getXInAVersion());
        System.out.println(c.getX());
        
    }

}
