public class Main {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        System.out.println("orginal list : ");
        list.print();

        list.reverse();
        System.out.println("reserved list : ");
        list.print();
    }
}
