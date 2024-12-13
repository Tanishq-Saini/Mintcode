import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int[] arr = ArrayElement(sc, size);
        Revert(arr);
        System.out.println("Reverse of Array is : "+ Arrays.toString(arr));
    }

    static int[] ArrayElement(Scanner sc, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void Revert(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            Swap(arr,s,e);
            s++;
            e--;
        }
    }
    static void Swap(int[] arr , int s , int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
