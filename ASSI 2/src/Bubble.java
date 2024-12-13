import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {10,2,4,50,65};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Sorting(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 0 ; j < arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
