import java.util.Date;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list=new DoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        System.out.println("doubly linked list : ");
        list.print();
    }
}
