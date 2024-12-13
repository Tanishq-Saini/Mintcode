import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int[] arr = ArrayElement(sc , size);
        System.out.println("Even Elements are : "+arr[0]);
        System.out.println("Odd Elements are : "+arr[1]);
    }
    static int[] ArrayElement( Scanner sc , int size){
        int[] arr = new int[size] ;
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        return Count(arr);
    }
    static int[] Count(int[] arr){
        int even = 0;
        int odd = 0;
        for(int i : arr){
            if(i%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        return new int[]{even , odd};
    }
}
