package Ejercicio1;

public class TreeWithNode {
    private TreeNode root;

    public TreeWithNode() {
        this.root = null;
    }
    public void insert(int value){
        if(this.root == null){
            this.root = new TreeNode(value);
        }else{
            this.insert(this.root, value);
        }
    }
    private void insert(TreeNode actual, int _value){
        if(actual.getValue() > _value){
            //Inserto a la izquierda
            if(actual.getLeft() == null){
                TreeNode tmp = new TreeNode(_value);
                actual.setLeft(tmp);
            }else{
                insert(actual.getLeft(), _value);
            }
        }else if(actual.getValue() < _value){
            //Inserto a la derecha
            if(actual.getRight() == null){
                TreeNode tmp = new TreeNode(_value);
                actual.setRight(tmp);
            }else{
                insert(actual.getRight(), _value);
            }
        }
    }
    //Ordenamientos
    private void inOrden(TreeNode _root) {
        if(_root != null){
            inOrden(_root.getLeft());
            System.out.print(_root.getValue()+" ");
            inOrden(_root.getRight());
        }
    }
    public void printInOrden(){
        this.inOrden(this.root);
    }
    private void posOrden(TreeNode _root) {
        if(_root != null){
            posOrden(_root.getLeft());
            posOrden(_root.getRight());
            System.out.print(_root.getValue()+" ");

        }
    }
    public void printPosOrden(){
        this.posOrden(this.root);
    }
    private void preOrden(TreeNode _root) {
        if(_root != null){
            System.out.print(_root.getValue()+" ");
            preOrden(_root.getLeft());
            preOrden(_root.getRight());
        }
    }
    public void printPreOrden(){
        this.preOrden(this.root);
    }
}
