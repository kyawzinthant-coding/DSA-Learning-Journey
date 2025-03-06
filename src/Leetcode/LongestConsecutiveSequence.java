
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static boolean LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int BruteForce(int[] arr) {
        int n = arr.length;
        int longest = 1;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 1;

            while (LinearSearch(arr, x + 1) == true) {
                x += 1;
                count++;
            }

            longest = Math.max(longest, count);

        }

        return longest;

    }

    public static int BetterApproach(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        Arrays.sort(arr);

        int lastSmallest = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmallest) {
                count++;
                lastSmallest = arr[i];
            } else if (arr[i] != lastSmallest) {
                count = 1;
                lastSmallest = arr[i];
            }

            longest = Math.max(longest, count);
        }
        return longest;

    }

    public static int OptimalSolution(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int longest = 1;
        Set<Integer> store = new HashSet<>();

        for (int i = 0; i < n; i++) {
            store.add(arr[i]);
        }

        for (int it : store) {
            if (!store.contains(it - 1)) {
                int count = 1;
                int x = it;

                while (store.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }

                longest = Math.max(longest, count);
            }

        }

        return longest;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 20, 4, 10, 3, 4, 5 };

        int result = BruteForce(arr);
        int result1 = BetterApproach(arr);
        int result2 = OptimalSolution(arr);

        System.out.println(result);
        System.out.println(result);

        System.out.println(result2);
    }
}