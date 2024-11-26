import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap : "+a+" "+b);
        Swap_No(a,b);
    }
    public static void Swap_No(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap : "+a+" "+b);
    }
}
