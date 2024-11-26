import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        float R = sc.nextFloat();
        float T = sc.nextFloat();
        float SI = (P * R * T)/100;
        System.out.format("%.3f",SI);
    }
}
