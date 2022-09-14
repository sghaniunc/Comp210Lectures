package Lecture7_9;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {3,4,5,6,10,20,25};
        int x = 250;  // The number to search for
        binarySearch(a, x);
    }
    static void binarySearch(int[] arr, int y){
        int index = -1; boolean result = false;
        int low=0; int high=arr.length-1; int mid;
        while (true){
            mid = (low + high)/2;
            if (y == arr[mid]) {
                index = mid; result = true; break;
            } else if (low == high) {
                break;
            } else if (y > arr[mid]) low = mid + 1;     // y is on the right side
            else high = mid - 1;                        // y is on the left side
        }
        if (result) {System.out.println("Integer " + y + " exists in the array at index=" + index + ".");}
        else { System.out.println("Integer " + y + " does not exist in the array.");}
    }
}
