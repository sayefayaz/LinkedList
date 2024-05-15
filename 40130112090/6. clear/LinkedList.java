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
   public void clear()
   {
       head=null;
   }
    public void print()
    {
        Node current=head;
        while (current!=null)
        {
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

}
