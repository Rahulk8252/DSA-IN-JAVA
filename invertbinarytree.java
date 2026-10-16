
    class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class invertbinarytree {

    static TreeNode invertTree(TreeNode root) {

        if (root == null)
            return null;

        // Swap
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursive call
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    static void preorder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        invertTree(root);

        preorder(root);
    }
}

