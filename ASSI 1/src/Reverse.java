import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        System.out.print("The number "+n);
        while(n > 0){
            rev = rev * 10 + ( n % 10);
            n/=10;
        }
        System.out.println(" and it's reverse is : "+rev);
    }
}
