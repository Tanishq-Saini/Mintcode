import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,10,10};
        System.out.println(Secondlargest(arr));
    }
    static int Largest(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
    static int Secondlargest(int[] arr){
        int largest = Largest(arr);
        int secondlargest = -1;
        for(int i : arr){
            if(largest != i){
                if(secondlargest == -1){
                    secondlargest = i;
                }
                else if(i > secondlargest){
                    secondlargest = i;
                }
            }
        }
        return secondlargest;
    }
}
