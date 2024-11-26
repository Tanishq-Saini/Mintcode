import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number "+n+" is "+Odd(n));

    }
    public static String Odd(int n){
        return (n%2 == 0)? "Even" : "odd";
    }
}
