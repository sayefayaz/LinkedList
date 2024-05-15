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
    public int find(int num)
    {
        Node current=head;
        int index=0;
        while (current!=null)
        {
            if (current.data==num)
            {
                return index;
            }
            index++;
            current=current.next;
        }
        return -1;
    }

}
