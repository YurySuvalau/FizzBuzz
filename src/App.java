import java.util.Scanner;

public class App{
    public static void fizzBuzz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type begin number: ");
        int begin = sc.nextInt();
        System.out.println("Type end number: ");
        int end = sc.nextInt();
        var count = begin;
        System.out.println("Counter is: ");
        for (int i = 0; count < end; i++) {
            count = begin + i;
            if (count % 3 == 0 && count % 5 == 0){
                System.out.println("FizzBuzz");
                }
                else if (count % 3 == 0) {
                System.out.println("Fizz");
                } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(count);
            }
        }
    }
}