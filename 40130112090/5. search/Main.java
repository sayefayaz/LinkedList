public class Main {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.addNode(2);
        list.addNode(2);
        list.addNode(3);
        list.addNode(1);
        int num=1;
        int index=list.find(num);
        if (index!=-1)
        {
            System.out.println("index of "+num+" is : "+index);
        }
        else
        {
            System.out.println("element not found in the list");
        }
    }
}
