import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int[] arr = ArrayElement(sc , size);
        PrintArray(arr);
    }
    static int[] ArrayElement( Scanner sc , int size){
        int[] arr = new int[size] ;
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void PrintArray(int[] arr){
            System.out.println("Array Elements are : "+Arrays.toString(arr));
    }
}