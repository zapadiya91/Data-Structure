public class Lab_12_68
{
    public static void main(String[] args)
    {
        myLinkedList linkedList=new myLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        System.out.print("linklist:");
        linkedList.display();
        System.out.println("after swaping two consicutive nodes: ");
        System.out.print("linklist:");
        linkedList.swapConsecutiveNodes();
        linkedList.display();
    }
}

class Node 
{
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

    public void swapConsecutiveNodes(){
        Node pre =First;
        Node temp = First.link;
        Node current=First.link;
        Node post=current.link;
        while(current!=null)
        {  
            post=current.link;
            if(post==null || post.link==null)
            {
                current.link=pre;
                pre.link=post;
                break;
            }
            pre.link=post.link;
            current.link=pre;
            pre=post; 
            current=pre.link;
        }
        First=temp;
    }
}    