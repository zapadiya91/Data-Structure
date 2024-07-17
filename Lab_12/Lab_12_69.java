public class Lab_12_69 {
    public static void main(String[] args) {
        myLinkedList linkedList = new myLinkedList();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(6);
        linkedList.add(13);
        linkedList.add(13);
        linkedList.add(13);
        linkedList.add(27);
        linkedList.add(27);

        System.out.println("Og sorted Linked-list: ");
        linkedList.display();
        linkedList.removesDuplicate();
        System.out.println("Linked-list without duplicates: ");
        linkedList.display();
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
    
    
    public void display(){
        Node temp=First;
        while(temp!=null){
            if(temp.link==null)
            {
                System.out.println(temp.info);
                break;
            }
            System.out.print(temp.info+"->");
            temp=temp.link; 
        }
    }
    public void add(int info){
        Node newNode = new Node(info, null);
        if(First == null)
        {
            First = newNode;
            return;
        }
        Node save=First;
        while(save.link!=null)
        {
            save=save.link;
        }
        save.link=newNode;
    }
    public void removeDuplicate(){ // can be used for both: non shorted and shorted linkedlist
        Node temp=First;
        while(temp!=null)
        {
            Node save=temp;
            while(save.link!=null)
            {
                if(temp.info==save.link.info)
                {
                    save.link=save.link.link;
                }
                else
                {
                    save=save.link;
                }
            }
                temp=temp.link;
        }
    }
    public void removesDuplicate(){//only useful for shorted linkedlist
        Node temp=First;
        
        while(temp!=null)
        {
            Node save=temp.link; 
            while(temp.info==save.info)
            {
                save=save.link;
            if(save==null){
                break;
            }
            }
            temp.link=save;
            temp=save;
        }
        
    }

}
