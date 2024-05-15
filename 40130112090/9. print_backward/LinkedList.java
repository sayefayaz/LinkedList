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
    public int size()
    {
        int counter=0;
        Node current=head;
        while (current!=null)
        {
            counter++;
            current=current.next;
        }
        return counter;
    }

}
