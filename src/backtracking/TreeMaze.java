package backtracking;

public class TreeMaze {

    public static boolean caneacthLeaf (TreeNode root ) {
        if ( root == null || root.val == 0) {
            return false;
        }

        if ( root.left == null && root.right == null) {
            return true;
        }

        if (caneacthLeaf(root.left)) {
            return true;
        }
        if (caneacthLeaf(root.right)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
