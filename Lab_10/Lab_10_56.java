//this class indicate basic Node structure of singly linear linkedlist.
class Node
{
    int info;
    Node link;
    Node(int info, Node link){
        this.info=info;
        this.link=link;
    }
    Node First=null;
}
public class Lab_10_56{
    
    public static void main(String[] args) {
        //creating new node
        Node newNode= new Node(5,null);
        
        //reading data of the newNode
        System.out.println("info of node: "+newNode.info);
        System.out.println("link of node: "+newNode.link);
        
        //printing newNode
        System.out.println("node: "+newNode);


    }
}