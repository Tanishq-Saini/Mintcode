import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("The sum of first "+n+" number is : ");
        while (n > 0){
            sum+=n;
            n--;
        }
        System.out.println(sum);
    }
}
