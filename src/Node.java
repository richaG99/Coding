public class Node {
    Node left;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    Node right;
    int data;
    public Node(int data, Node left, Node right){
        this.left = left;
        this.right = right;
        this.data = data;
    }


}
