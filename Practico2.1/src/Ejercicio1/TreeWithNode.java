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

    public int getRoot() {
        if(this.root != null){
            return root.getValue();
        }else{
            return -1;
        }
    }
    public boolean isEmpty(){
        return this.root == null;
    }
    public  boolean hasElem(int _value){
        return hasElem(this.root, _value);
    }
    private boolean hasElem(TreeNode _root, int _value){
        if(_root != null){
            if(_root.getValue() == _value){
                return true;
            }else if(_value < _root.getValue()){
                return hasElem(_root.getLeft(), _value);
            }else{
                return hasElem(_root.getRight(), _value);
            }
        }else{
            return false;
        }
    }

    public int getMaxElem(){
        return getMaxElem(root);
    }
    private int getMaxElem(TreeNode _root){//para encontrar el sucesor
        if(_root != null){
            if(_root.getRight() == null){
                return _root.getValue();
            }else{
                return getMaxElem(_root.getRight());
            }
        }else{
            return -1;
        }
    }
    //Busco el menor elemento del abol
    public int getMinElem(){ //para encontrar el predecesor

        TreeNode minNode = getMinElem(root);
        if (minNode != null) {
            return minNode.getValue();
        } else {
            return -1;
        }
    }
    private TreeNode getMinElem(TreeNode node) {
        if (node == null) {
            return null;
        } else if (node.getLeft() == null) {
            return node;
        } else {
            return getMinElem(node.getLeft());
        }
    }
    public boolean delete(int value){
      TreeNode tmp = root;
      if(tmp != null){
          tmp= deleteNode(tmp,value);
          return tmp == null;
      }
      return false;
    }
    private TreeNode deleteNode(TreeNode tmp, int value) {
        if(tmp != null){
            if(value  > tmp.getValue()){
                tmp.setRight(this.deleteNode(tmp.getRight(), value));
            }else if(value  < tmp.getValue()){
                tmp.setLeft(this.deleteNode(tmp.getLeft(), value));
            }else{
                //verifico que no sea una hoja
                if(tmp.getRight() == null && tmp.getLeft() == null){
                    tmp = null;//elimino
                }else if(tmp.getRight() != null){
                    tmp.setValue(this.getSucesor(tmp));
                    tmp.setRight(this.deleteNode(tmp.getRight(), tmp.getValue()));
                }else{
                    tmp.setValue(this.predecesor(tmp));
                    tmp.setLeft(this.deleteNode(tmp.getLeft(), tmp.getValue()));
                }
            }
        }
        return tmp;
    }

    private int predecesor(TreeNode _tmp) {
        _tmp= _tmp.getLeft();
        while(_tmp.getRight() != null){
            _tmp = _tmp.getRight();
        }
        return _tmp.getValue();
    }

    private int getSucesor(TreeNode _tmp) {
        _tmp= _tmp.getRight();
        while(_tmp.getLeft() != null){
            _tmp = _tmp.getLeft();
        }
        return _tmp.getValue();
    }

	public void printInOrden(){
        this.inOrden(this.root);
    }
    //Ordenamientos
    private void inOrden(TreeNode _root) {
        if(_root != null){
            inOrden(_root.getLeft());
            System.out.print(_root.getValue()+" ");
            inOrden(_root.getRight());
        }
    }
    
	public void printPosOrden(){
        this.posOrden(this.root);
    }
    private void posOrden(TreeNode _root) {
        if(_root != null){
            posOrden(_root.getLeft());
            posOrden(_root.getRight());
            System.out.print(_root.getValue()+" ");
        }
    }
    public void printPreOrden(){
        this.preOrden(this.root);
    }
    private void preOrden(TreeNode _root) {
        if(_root != null){
            System.out.print(_root.getValue()+" ");
            preOrden(_root.getLeft());
            preOrden(_root.getRight());
        }
    }
    
}
