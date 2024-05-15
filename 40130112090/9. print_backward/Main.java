public class Main {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        System.out.print("{");
        Node current=list.head;
        int size=list.size();
        for (int i = 0; i < size-1; i++) {
            current=current.next;
        }
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
