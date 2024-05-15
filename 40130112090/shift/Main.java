public class Main {
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class SingleLinkedList{
        Node head;
        public SingleLinkedList()
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
                Node current=head;
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
        public void shift(int num)
        {
            if (head==null||head.next==null)
            {
                return;
            }
            Node current=head;
            int count=1;
            while (count<num&&current!=null)
            {
                current=current.next;
                count++;
            }
            if (current==null)
            {
                return;
            }
            Node kthNode=current;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=head;
            head=kthNode.next;
            kthNode.next=null;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("orginal list : ");
        list.print();

        int num=2;
        list.shift(num);

        System.out.println("shifted list : ");
        list.print();

    }
}
