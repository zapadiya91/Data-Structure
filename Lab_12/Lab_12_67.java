public class Lab_12_67 {
    public static void main(String[] args) {
        
        myLinkedList linkedList=new myLinkedList();
        linkedList.add(100);
        linkedList.add(25);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(40);
        linkedList.add(60);
        linkedList.gcdBetween();
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

    public void gcdBetween(){
        Node current= First;
        Node next= current.link;
        while(next!=null){
            int gcd=0;
            for(int i=1;i<=current.info;i++)
            {
                if(current.info%i==0 && next.info%i==0)
                {
                    gcd=i;
                }
            }
            Node newNode=new Node(gcd, null);
            current.link=newNode;
            newNode.link=next;
            current=next;
            next=next.link;
        }
    }
}



