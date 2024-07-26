
import java.util.Scanner;



public class CirclerQueueImplement
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        myCircularQueue circularQueue=new myCircularQueue(10);

        System.out.println("size of queue: "+circularQueue.size);

        circularQueue.insert(5);
        circularQueue.insert(6);
        circularQueue.insert(7);
        circularQueue.insert(8);

        System.out.print("circular queue: ");
        circularQueue.display();

        do { 
            System.out.println("Enter 1 to insert, 2 to delete, 3 to display ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:

                System.out.println("enter integer that you want to insert into circular queue: ");
                int num=sc.nextInt();
                circularQueue.insert(num);
                System.out.println("after insertion, circular queue: ");
                circularQueue.display();
                    break;
                case 2:
                    System.out.println("after deletion, circular queue: ");
                    circularQueue.delete();
                    circularQueue.display();
                    break;
                case 3:
                System.out.println("circular queue: ");
                circularQueue.display();
                break;
                default:
                System.out.println("invalid choice");
                break;
            }
            System.out.println("do want to continue ?");
            System.out.println("enter 1 for Yes !");
            int run=sc.nextInt();
            if(run!=1)
            break;

        } while (true);
      
        sc.close();
        
    }
}
class myCircularQueue
{
    int front=-1;
    int rear=-1;
    int size;
    int []q;
    myCircularQueue(int size)
    {
        this.size=size;
        q= new int[size];
    }
    public void insert(int data)
    {
        if((rear+1)%size==front)
        {
            System.out.println("Queue is overflow !");
        }
        else{
            rear=(rear+1)%size;
            q[rear]=data;
            
        }
        if(front==-1)
        {
            front=0;
        }
    }
    public void delete()
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