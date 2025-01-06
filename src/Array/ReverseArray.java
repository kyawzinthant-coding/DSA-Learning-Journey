package Array;

public class ReverseArray {

    public static void reverse(int i, int j, int[] arr, int n) {
        if (i >= n) {
            return; // Base case: stop when the start index exceeds the array bounds
        }

        System.out.println(i);
        System.out.println(j);
        // Adjust `j` to ensure it does not exceed the array bounds
        j = Math.min(j, n);

        // Reverse elements in the current group
        int k, z;
        for (k = i, z = j; k < z; k++, z--) {
            int temp = arr[k];
            arr[k] = arr[z];
            arr[z] = temp;
        }

        // Recursive call for the next group
        reverse(j + 1, j + (j - i + 1), arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
        int size = 3; // Group size
        reverse(0, size - 1, arr, arr.length - 1);

        System.out.println("Reversed Array in Groups:");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
