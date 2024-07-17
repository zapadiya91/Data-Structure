import java.util.Scanner;
public class Lab_10_57
{
  public static void main(String[] args) 
  {

    Scanner sc=new Scanner(System.in);

    myLinkedList linkedList=new myLinkedList();
    linkedList.insertAtFirst(5);
    linkedList.insertAtFirst(15);
    linkedList.insertAtFirst(20);
    linkedList.insertAtFirst(25);
    linkedList.insertAtFirst(30);

    System.out.println("linked list: ");
    linkedList.display();

    do
    {
        System.out.println("which operation do you want to perform in the linked list");
        System.out.println("1. insert at first");
        System.out.println("2. insert at last");
        System.out.println("3. insert at position");
        System.out.println("4. delete at first");
        System.out.println("5. delete at last");
        System.out.println("6. delete at position");
        System.out.println("7. display");
        int operation=sc.nextInt();
        switch (operation) {
            case 1:
            System.out.print("enter integer to insert at first position of linkedlist: ");
            int x=sc.nextInt();
            linkedList.insertAtFirst(x);
                break;
            case 2:
            System.out.print("enter integer to insert at last position of linkedlist: ");
            int y=sc.nextInt();
            linkedList.insertAtLast(y);
                break;
            case 3:
            System.out.println("enter index from first position of the linkedlist: ");
            int index=sc.nextInt();
            System.out.print("enter integer to insert at "+ index+ " position of linkedlist: ");
            int z=sc.nextInt();
            linkedList.insertAtPositon(z, index);
                break;
            case 4:
            linkedList.deleteAtFirst();
                break;
            case 5:
            linkedList.deleteAtLast();
                break;
            case 6:
            System.out.print("enter integer to delete at from first position of linkedlist: ");
            int a=sc.nextInt();
            linkedList.deleteAtPosition(a);
                break;
            case 7:
            System.out.print("linked list: ");
            linkedList.display();
                break;              
            default:
            System.out.println("invalid operation");
                break;
        }
        System.out.println("do you want to continue ? ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice=sc.nextInt();
        if(choice!=1){
            sc.close();
            System.out.println("Thank you for using this program");
            return;
        }
    }
    while(true);
    
  }  
}

class Node
{
    int info;
    Node link;
    Node(int info, Node link)
    {
        this.info=info;
        this.link=link;
    }
    
}
class myLinkedList
{
    Node First=null;
    public void insertAtFirst(int info)
    {
        Node newNode=new Node(info,null);
        if(First==null)
        {
            First=newNode;
            return;
        }
        newNode.link=First;
        First=newNode;
    }
    public void insertAtLast(int info)
    {
        Node newNode=new Node(info, null);
        if(First==null)
        {
            First=newNode;
            return;
        }
        Node Last=First;
        while(Last.link!=null){
            Last=Last.link;
        }
        Last.link=newNode;
    }
    public void insertAtPositon(int info,int index){
        Node newNode=new Node(info,null);
        if(First==null)
        {
            First=newNode;
            return;
        }
        Node temp=First;
        int i=0;
        while(i<index-1)
        {
            temp=temp.link;
            i++;
        }
        if(temp==null)
        {
            System.out.println("Index out of bound");
            return;
        }
        newNode.link=temp.link;
        temp.link=newNode;
    }
    public void deleteAtFirst()
    {
        if(First==null)
        {
            System.out.println("List is empty)");
            return;
        }
        First=First.link;
    }
    public void deleteAtLast()
    {
        if(First==null)
        {
            System.out.println("List is empty.");
            return;
        }
        Node preLast=First;
        while(preLast.link.link!=null){
            preLast=preLast.link;
        }
        preLast.link=null;
    }
    public void deleteAtPosition(int index)
    {
        int i=1;
        if(First==null)
        {
            System.out.println("List is empty.");
            return;
        }
        if(index<=0){
            System.out.println("Index out of bound");
            return;
        }
        if(index==1){
            First=First.link;
            return;
        }
        Node save=First;
        while(i<index-1)
        {
            save=save.link;
            i++;
        }
        save.link=save.link.link;
    }
    public void display(){
        Node temp=First;
        while(temp!=null){
            System.out.print(temp.info+"->");
            temp=temp.link; 
        }
    }

}