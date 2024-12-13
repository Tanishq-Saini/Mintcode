import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scn.nextInt();
        System.out.print("Enter number of columns: ");
        int col = scn.nextInt();
        int[][] arr= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= scn.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
