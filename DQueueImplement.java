
import java.util.Scanner;



public class DQueueImplement
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        myDQueue dQueue=new myDQueue(10);
        dQueue.insertAtRear(5);
        dQueue.insertAtRear(6);
        dQueue.insertAtRear(7);
        dQueue.insertAtRear(8);
        System.out.println("size of double ended circluar queue:"+ dQueue.size);
        dQueue.display();

        do {
            System.out.println("enter the choice");
            System.out.println("1.insert at rear");
            System.out.println("2.insert at front");
            System.out.println("3.delete at rear");
            System.out.println("4.delete at front");
            System.out.println("5.display");
            System.out.println("6.exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("enter the element to insert at rear");
                int element=sc.nextInt();
                dQueue.insertAtRear(element);
                break;
                case 2:
                System.out.println("enter the element to insert at front");
                element=sc.nextInt();
                dQueue.insertAtFront(element);
                break;
                case 3:
                dQueue.deleteAtRear();
                break;
                case 4:
                dQueue.deleteAtFront();
                break;
                case 5:
                System.out.print("double ended circular queue: ");
                dQueue.display();
                break;
                case 6:
                break;
                default:
                System.out.println("enter valide choice :/");
            }
        } while (true);
        
    }
}
class myDQueue
{
    int front=-1;
    int rear=-1;
    int size;
    int []q;
    myDQueue(int size)
    {
        this.size=size;
        q= new int[size];
    }
    public void insertAtRear(int data)
    {
        if((rear+1)%size==front)
        {
            System.out.println("Queue is overflow !");
        }
        else{
            rear=((rear+1)%size);
            q[rear]=data;
            
        }
        if(front==-1)
        {
            front=0;
        }
    }
    public void insertAtFront(int data)
    {
        if((front-1)%size==rear)
        {
            System.out.println("Queue is overflow !");
        }
        else{
            System.out.println(front);
            front=(front-1)%size;
            System.out.println(front);
            q[front]=data;
            
        }
        if(rear==-1)
        {
            rear=0;
        }
    }

    public void deleteAtFront()
    {
        if(front<0)
        {
            System.out.println("Queue is underflow !");
            return;
        }
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            front=(front+1)%size;
        }
    }

    public void deleteAtRear()
    {
        if(rear<0)
        {
            System.out.println("Queue is underflow !");
            return;
        }
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            rear=(rear-1)%size;
        }
    }
    public void display()
    {
        if(front<0)
        {
            System.out.println("Queue is Empty !");
            return;
        }
        for(int i=front;i!=rear+1;i=(i+1)%size)
        {
            System.out.print(q[i]+" ");
        }
        System.out.println();
    }
}