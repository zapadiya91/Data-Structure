public class Lab_12_1 {
    public static void main(String[] args) {
        myLinkedList linkedlist = new myLinkedList();
        linkedlist.Add(1);
        linkedlist.Add(2);
        linkedlist.Add(3);
        linkedlist.Add(4);
        linkedlist.Add(5);
        myLinkedList copyLinkedList = linkedlist.copy();
        copyLinkedList.display();
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

    public void Add(int info) {
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

    public myLinkedList copy() {
        myLinkedList copiedList = new myLinkedList();
        Node temp = this.First;
        while (temp != null) {
            copiedList.Add(temp.info);
            temp = temp.link;
        }
        return copiedList;
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
}

