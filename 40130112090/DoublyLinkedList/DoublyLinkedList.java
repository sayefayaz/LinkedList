import javax.naming.NameNotFoundException;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public void addNode(int data)
    {
        Node newNode=new Node(data);
        if (head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void print()
    {
        Node current=head;
        while (current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
