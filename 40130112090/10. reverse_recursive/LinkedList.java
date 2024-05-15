public class LinkedList {
    Node head;
    public LinkedList()
    {
        this.head=null;
    }
    public void addNode(int data)
    {
        Node newNode=new Node(data);
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            Node current=head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void reverse()
    {
        Node current=head;
        Node temp=null;
        while (current!=null)
        {
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if (temp!=null)
        {
            head=temp.prev;
        }
    }
    public void print()
    {
        Node current=head;
        System.out.print("{");
        while (current!=null)
        {
            System.out.print(current.data);
            if (current.next!=null)
            {
                System.out.print(", ");
            }
            current=current.next;
        }
        System.out.println("}");
    }
}
