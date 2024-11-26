import java.util.Scanner;

public class Divsible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The number "+n+" is divisible by 5 : ");
        String check = (n % 5 == 0)? "Yes" : "No";
        System.out.println(check);
    }
}
