package January2021;

import java.util.Arrays;

/**
 * @author Pankaj Kumar
 * @since 1/24/2021
 */
public class ReverseArray {

    public static void reverseArray(int[] arr){
        int end = arr.length-1;
        int start =  0;

        while (start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]){
            int arr[] = {1,2,3,4,5};
            reverseArray(arr);
            System.out.println(Arrays.toString(arr));
    }
}


// time complexity O(n/2)
// space complexity O(1);
