import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = ((n % 3 == 0) && (n % 5 == 0))? "Yes" : "No";
        System.out.println("The number "+n+" is divisible by 3 and 5 : "+result);
    }
}
