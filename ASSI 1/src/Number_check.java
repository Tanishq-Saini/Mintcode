import java.util.Scanner;

public class Number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
            if (n >= 0) {
                System.out.println("Nor negative nor Positive");
            } else if (n > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
    }
}