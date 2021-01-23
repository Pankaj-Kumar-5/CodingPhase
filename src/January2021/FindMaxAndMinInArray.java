package January2021;

/**
 * @author Pankaj Kumar
 * @since 1/24/2021
 */
public class FindMaxAndMinInArray {

    public static int findMaximum(int arr[]) {
        return findMax(arr, 0);
    }

    public static int findMinimum(int arr[]) {
        return findMin(arr, 0);
    }

    private static int findMax(int arr[], int start) {
        if (arr.length - 1 == start) {
            return arr[start];
        }

        if (arr[start] > findMax(arr, start + 1)) {
            return arr[start];
        } else {
            return findMax(arr, start + 1);
        }
    }

    private static int findMin(int arr[], int start) {
        if (arr.length - 1 == start) {
            return arr[start];
        }

        if (arr[start] < findMin(arr, start + 1)) {
            return arr[start];
        } else {
            return findMin(arr, start + 1);
        }
    }


    public static void main(String args[]) {
        int temp[] = {10, 1, 2, 11, 3, 4, 5,-10};

        int min = findMinimum(temp);
        int max = findMaximum(temp);

        System.out.println("Max "+max+"\n"+"Min "+min);
    }
}

// time complexity O(n)
// Space complexity O(1)