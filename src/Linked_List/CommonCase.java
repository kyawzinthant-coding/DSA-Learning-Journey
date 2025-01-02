package Linked_List;


import java.util.ArrayList;
import java.util.List;

class Result {
    int index;
    String value;
    int matchIndex;
    int sum;

    // Constructor
    public Result(int index, String value, int matchIndex, int sum) {
        this.index = index;
        this.value = value;
        this.matchIndex = matchIndex;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Result{" +
                "index=" + index +
                ", value='" + value + '\'' +
                ", matchIndex=" + matchIndex +
                ", sum=" + sum +
                '}';
    }
}


public class CommonCase {

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<Result> resultList = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    resultList.add(new Result(i, list1[i], j, i+j));
                }
            }
        }

        List<String> minResults = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        String arr[] = {"kayw"};


        for (Result result : resultList) {
            if (result.sum < minSum) {
                minSum = result.sum;
                minResults.clear(); // Clear previous results
                minResults.add(result.value);
            } else if (result.sum == minSum) {
                minResults.add(result.value);
            }
        }


        return minResults.toArray(new String[0]);
    }

    public static void main(String[] args) {
        CommonCase solution = new CommonCase();

        // Example inputs
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};

        // Find the common restaurants
        String[] leastSumResults = solution.findRestaurant(list1, list2);

        for (String value : leastSumResults) {
            System.out.println(value);
        }

    }
}
