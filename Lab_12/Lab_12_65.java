public class Lab_12_3 {
    public static void main(String[] args) {
        
        myLinkedList linkedList=new myLinkedList();
        linkedList.add(100);
        linkedList.add(25);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(45);
        linkedList.add(61);
        linkedList.sort();
        linkedList.display();

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

    public void sort()
    {
        Node current=First;
        while(current!=null)
        {
            Node next=current.link;
            while(next!=null)
            {
                if(current.info>next.info)
                {
                    int temp=current.info;
                    current.info=next.info;
                    next.info=temp;
                }
                next=next.link;
            }
            current=current.link;
        }        
    }

}



