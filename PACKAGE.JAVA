import myPackages.Fib;

public class Test {
    public static void main(String[] args) {
        Fib obj = new Fib();
        System.out.println("Fibonacci numbers up to 10 numbers");
        System.out.println(obj.fibonacci(4));
        obj.fibseries(10);
    }
}



package myPackages;

public class Fib {

    // returns nth fibonacci number
    public int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = a + b;
        int count = 2;
        while (count < n) {
            if (n == 1) {
                return 0;
            } else if (n == 2) {
                return 1;
            } else {
                c = a + b;
                a = b;
                b = c;
            }
            count++;
        }
        return c;
    }

    // print fibonacci series up to n numbers
    public void fibseries(int n) {
        int a = 0;
        int b = 1;
        int c = a + b;
        int count = 0;
        while (count < n) {
            if (count == 0) {
                System.out.print(0);
                System.out.print(" ");
            } else if (count == 1) {
                System.out.print(1);
                System.out.print(" ");
            } else {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c);
                System.out.print(" ");
            }
            count++;
        }
    }
}
