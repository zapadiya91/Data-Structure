public class Lab_12_2 {
    public static void main(String[] args) {
        
        myLinkedList linkedList=new myLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.reverse();
        linkedList.reverse();

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

    public void display() {
        Node temp = First;
        while (temp!= null) {
            if(temp.link==null){
                System.out.println(temp.info);
                break;
            }
            System.out.print(temp.info + "->");
            temp = temp.link;
        }

    }

    public  void reverse(){
        Node pre=First;
        Node cur=First.link;
        Node post=First.link.link;
        while(post !=null)
        {
            cur.link=pre;
            pre=cur;
            cur=post;
            post=post.link;
        }
    }
}


