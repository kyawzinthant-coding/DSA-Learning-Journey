package BinarySearchStructure;

public class BinarySearch2D {


    public static boolean searchMatrix(int[][] matrix, int target) {
        int L = 0 ; int H = (matrix.length * matrix[0].length)-1;
        int C = matrix[0].length;
        int mid ;

        while ( L <= H) {
            mid = ( L + H ) /2;
            int row = mid/C;
            int col = mid%C;

            if ( target > matrix[row][col]){
                L = mid + 1;
            }else if (target < matrix[row][col]){
                H = mid -1;
            }else {
                return true;
            }
        }



        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1}};

        System.out.println(searchMatrix(matrix,0));

        System.out.println(matrix[0].length);

    }
}
