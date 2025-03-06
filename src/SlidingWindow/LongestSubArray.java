package SlidingWindow;


import java.util.ArrayList;

// longest sub array with sum <= k;
public class LongestSubArray {

    //brute force

    public static void SubArrayBruteForce(int[] arr, int k) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                list.add(arr[j]);
                mainList.add(new ArrayList<>(list));
            }

        }
        System.out.println(mainList);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        SubArrayBruteForce(arr, 4);
    }
}
