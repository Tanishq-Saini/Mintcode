import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 3; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b+" ");
        }
    }
}
