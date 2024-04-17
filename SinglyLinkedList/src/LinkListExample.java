 class Node
{
    int data; //variable to store data
    Node next;  //variable to store next node link
    
    Node(int data)   //constructor
    {
        this.data = data;
        this.next = null;
    }

}
class LinkedList
{
    Node head;    //front node 
    
    LinkedList() //constructor
    {
        this.head = null;
    }
   public void insertAtFront(int data) //inserting data at front
    {
         Node newNode = new Node(data);
         if(head==null)
            this.head = newNode;
        else
        {
         newNode.next = this.head;
         this.head = newNode;
        }
         System.out.println(data +" inserted at front");

    }
    public void insertAtLast(int data) //inserting data at last
    {
        Node newNode = new Node(data);
        Node currentNode = head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
       System.out.println(data +" inserted at last");
    }

    public void insertAtPosition(int data,int position) //inserting node at a specific position
    {
        Node newNode = new Node(data);
        Node currentNode = head;
        int currentPosition = 0;

        if(position == 1)
        {
            insertAtFront(data);
        }
        else
        {
           while(currentPosition<position-1)
          {
            currentNode = currentNode.next;
            currentPosition++;

          }
          newNode.next = currentNode.next;
          currentNode.next = newNode;
        }
        System.out.println(data+" inserted at position "+position);     
    }
  
    public  void displayNode() //displaying data of all nodes
     {
        Node currentNode;
        currentNode = head;
        while(currentNode!= null)
        {
            System.out.println( currentNode.data);
            currentNode = currentNode.next;
        }
     }

     public void deleteFrontNode() //deleting node from front
     {
       if(head.next==null)
         System.out.println("Empty Node");
       else
       {
       System.out.println(head.data +" deleted");
       head = head.next;
       }
       
     }
     
    public void deleteLastNode() //deleting node from last
    {
       if(head.next==null)
         System.out.println("Empty Node");
        else
        {
           Node currentNode = head;
           Node nextNode = head.next;
           while(nextNode.next!=null)
           {
           currentNode = currentNode.next;
           nextNode = currentNode.next;
           }
           System.out.println(currentNode.next.data+" deleted");
          currentNode.next = null;
          
         }
         
    }
    public void deleteAtPosition(int position) //deleting node from specific position
    {
        int currentPosition = 1;
        Node currentNode = head;
        while (currentPosition<position-1)
        {
            currentNode = currentNode.next;
            currentPosition++;

        }
       System.out.println(currentNode.next.data+" deleted from position "+position);
        currentNode.next = currentNode.next.next;

    }
}
public class LinkListExample   //Main Class
{
    public static void main(String[] args)
    {
        LinkedList myNode = new LinkedList();
        myNode.insertAtFront(10);
        myNode.insertAtFront(20);
        myNode.insertAtFront(30);
        myNode.insertAtLast(99);
       
        myNode.insertAtPosition(11,1);
        myNode.displayNode();
        myNode.deleteFrontNode();
        myNode.deleteLastNode();
        myNode.deleteAtPosition(2);
        } 
}