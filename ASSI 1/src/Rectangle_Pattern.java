import java.util.Scanner;

public class Rectangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of col : ");
        int col = sc.nextInt();
        for (int i = 0; i < row ; i++) {
            for(int j = 0 ; j < col ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
