public class SingleLinkedList {
    Node head;

    public  SingleLinkedList()
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
        else {
            Node current = head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
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
