package main.java;

public class BinaryTree {
    No root;

    public BinaryTree(){
        this.root = null;
    }

    void put(Integer value){
        this.root = recursive(root, value);
    }

    No recursive(No newNo, Integer value) {
        if(newNo == null)
            return new No(value);

        if(value < newNo.key){
            newNo.left = recursive(newNo.left, value);
        } else if (value > newNo.key) {
            newNo.right = recursive(newNo.right, value);
        }
        return newNo;
    }

    void sortObjects(No no) {
        if (no != null) {
            sortObjects(no.left);
            System.out.print(no.key + " ");
            sortObjects(no.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree arvore = new BinaryTree();

        arvore.put(50);
        arvore.put(30);
        arvore.put(70);
        arvore.put(20);
        arvore.put(40);
        arvore.put(60);
        arvore.put(80);

        System.out.println("Binary Tree:");
        arvore.sortObjects(arvore.root);
    }
}

class No {
    Integer key;
    No left;
    No right;

    public No(Integer key){
        this.key = key;
        left = right = null;
    }
}
