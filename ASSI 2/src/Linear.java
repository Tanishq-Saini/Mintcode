public class Linear {
    public static void main(String[] args) {
    int[] arr = {12,56,89,10,74,156};
    int target = 89;
        System.out.println(range(arr,target,1,5));
    }
    static int range(int[] num , int value , int start , int end) {
    if (num.length == 0) {
        return -1;
    }
    for (int index = start; index <= end; index++) {
        int element = num[index];
        if (element == value) {
            return index;
        }
    }
    return Integer.MIN_VALUE;
   }
}
