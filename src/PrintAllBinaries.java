public class PrintAllBinaries {
    Node root ;

    public PrintAllBinaries(){
        root = new Node( 4, null, null);
        Node rleft = new Node( 2, null, null);
        Node rright = new Node(6, null, null);
        root.setLeft(rleft);
        root.setRight(rright);

        Node tleft = new Node( 1, null, null);
        Node tright = new Node(3, null, null);
        rleft.setLeft(tleft);
        rleft.setRight(tright);


        Node sixleft = new Node( 5, null, null);
        Node sixright = new Node(7 ,null, null);
        rright.setLeft(sixleft);
        rright.setRight(sixright);

    }

    public static void main(String args[]){
        PrintAllBinaries  p = new PrintAllBinaries();
        //p.inorder(p.root);
        p.printSideway();
    }

    public void inorder(Node root){
        if( root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }

    public void printSideway(){
        printSideWayHelper(root, "");
    }

    public void printSideWayHelper(Node root, String indent){

        if(root == null){
            return;
        }

        printSideWayHelper(root.right , indent + "...");
        System.out.println(indent + root.data);
        printSideWayHelper(root.left , indent + "...");


    }





}
