class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    Node tail;

    LinkedList(){
        head = null;
        tail = null;
    }

    

    public void insertAtFront(int data) //inserting node from front
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
        System.out.println(data +" at front");
    }
    public void insertAtLast(int data) //inserting node from last
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        System.out.println(data+" inserted at last");
    }

    public void insertAtPosition(int position, int data) //inserting node at specific position
    {
    	Node newNode = new Node(data);
        Node currentNode = head;
        int currentPosition = 1;

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
    
    public void deleteAtFront()  //deleting node from front
    {
    	if(head==null)
    		System.out.println("Link List is Empty");
    	else
    	{
    		System.out.println(head.data+" deleted from front");
    		head = head.next;
    		tail.next = head;		
    	}
    }
    public void deleteAtLast() //deleting node from last
    {
    	Node currNode = head;
    	if(tail==null)
    		System.out.println("Link List is Empty");
    	else
    	{
    		System.out.println(tail.data+" deleted from last");
    		while(currNode.next!=tail)
    		{
    			currNode = currNode.next;
    		}	
    		currNode.next = head;
    		tail = currNode;
    	}
    }
    public void deleteAtPosition(int position) //deleting node at specific position
    {
    	Node currNode = head;
    	int count = 1;
    	if(head==null)
    		System.out.println("Link List is Empty");
    	else
    	{
    		while(count<position-1)
    		{
    			currNode = currNode.next;
    			count++;
    		}
    		System.out.println(currNode.next.data +" deleted from position "+position);
    		currNode.next = currNode.next.next;
    	}
    }

    public void displayNodes()  //displaying data of all nodes 
    {
        if(head==null)
        {
            System.out.println("Linked List is Empty");
        }
        else
        {
        	System.out.println("Lists : ");
             Node currentNode = head;
             while(currentNode.next != head)
             {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
             }
             System.out.println(currentNode.data);
        }
    }
}
public class LinkedListExample{
    public static void main(String[] args)
    {
        LinkedList myNode = new LinkedList();
        myNode.insertAtFront(11);
        myNode.insertAtFront(12);
        myNode.insertAtFront(13);
        myNode.insertAtLast(22);
        myNode.insertAtPosition(3,10);
        myNode.displayNodes();
        myNode.deleteAtFront();
        myNode.deleteAtLast();
        myNode.deleteAtPosition(2);
        myNode.displayNodes();
    }
}
