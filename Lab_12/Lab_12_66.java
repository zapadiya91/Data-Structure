import java.util.Scanner;

//this code contais method that can swap Kth node from beginning with Kth node from end in a singly linked list. 

public class Lab_12_66{
    public static void main(String[] args) {

        myLinkedList linkedList=new myLinkedList();
        linkedList.add(100);
        linkedList.add(25);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(40);
        linkedList.add(60);
        
        Scanner sc=new Scanner(System.in);
        System.out.print("linklist:");
        linkedList.display();
        System.out.print("enter the value of K: ");
        int k=sc.nextInt();
        linkedList.swapK(k);
        System.out.println("linklist after swapping Kth node from beginning with Kth node from end:");
        linkedList.display();
        sc.close();
    }
}
class Node {
    int info;
    Node link;

    Node(int info, Node link) {
        this.info = info;
        this.link = link;
    }
}

class myLinkedList {
    Node First = null;

    public void add(int info) {
        Node newNode = new Node(info, null);
        if (First == null) {
            First = newNode;
            return;
        }
        Node temp = First;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }

    public void display() 
    {
        Node temp = First;
        while (temp!= null) 
        {
            if(temp.link==null)
            {
                System.out.println(temp.info);
                break;
            }
            System.out.print(temp.info + "->");
            temp = temp.link;
        }
    }

    public void swapK(int k)
    {
        Node temp = First;
        Node tempo=First;
        int n=numberOfNode();

        if(k>n || k<1)
        {
            System.out.println("given elements are not available !");
            return;
        }

        for(int i=1;i<k;i++)
        {
            temp = temp.link;
        }
        for(int i=1;i<=n-k;i++)
        {
            tempo = tempo.link;
        }
        int data=temp.info;
        temp.info=tempo.info;
        tempo.info=data;
    }
    public int numberOfNode()
    {
        Node temp = First;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp = temp.link;
        }
        return count;
    }
}



