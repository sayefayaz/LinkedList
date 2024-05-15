public class Main {
    public static DoublyLinkedList convertToDoublyLinkedList(SingleLinkedList singleLinkedList)
    {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        Node current=singleLinkedList.head;
        while (current!=null)
        {
            doublyLinkedList.addNode(current.data);
            current=current.next;
        }
        return doublyLinkedList;
    }
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.addNode(1);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(3);

        System.out.println("Singly linked list : ");
        singleLinkedList.print();

        DoublyLinkedList doublyLinkedList=convertToDoublyLinkedList(singleLinkedList);
        System.out.println("Doubly linked list : ");
        doublyLinkedList.print();

    }
}
