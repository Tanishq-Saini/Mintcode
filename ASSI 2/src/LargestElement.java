import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int[] arr = ArrayElement(sc , size);
        System.out.println("The Largest Element in Array is : "+Largest(arr));
    }
    static int[] ArrayElement( Scanner sc , int size){
        int[] arr = new int[size] ;
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static int Largest(int[] arr){
        int max = arr[0];
       for(int i : arr){
           if(max < i){
               max = i;
           }
       }
       return max;
    }
}
