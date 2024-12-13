import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int[] arr = ArrayElement(sc , size);
        System.out.println("The Sum of Array is : "+Sum(arr));
    }
    static int[] ArrayElement( Scanner sc , int size){
        int[] arr = new int[size] ;
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static int Sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
