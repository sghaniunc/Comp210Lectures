package Lecture7_9;
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {20, 5, 3, 25, 10, 4, 6};
        int x = 41;         // The number to search for
        searchArray(a, x);
    }
    static void searchArray(int[] b, int y){
        int index = -1;     // index of y (if found)
        boolean result = false;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == y) {
                result = true;
                index = i;
                break;
            }
        }
        if (result) {
            System.out.println("Integer " + y + " exists in the array at index=" + index + ".");
        } else {
            System.out.println("Integer " + y + " does not exist in the array.");
        }
    }
}
