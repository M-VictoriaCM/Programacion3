package Ejercicio1;

public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return toString(" ", true);
    }
    private String toString(String actual, boolean esElultimo){
        String tree = actual;
        if(esElultimo){
            tree +="└──";
            actual += " ";
        }else{
            tree += "├──";
            actual += "│ ";
        }
        tree += this.value + "\n";
        if(this.getLeft() != null){
            tree += this.getLeft().toString(actual, this.getRight() == null);
        }
        if(this.getRight() != null){
            tree += this.getRight().toString(actual, true);
        }
        return tree;
    }
}
