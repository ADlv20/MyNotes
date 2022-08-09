package DataStructure;

public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){
        this.size = 0;
    }

    public class Node{

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void insertBeginning(int value){
        Node node = new Node(value);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void printList(){
        Node node = head;

        if (head == null){
            return;
        }

        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertBeginning(5);
        list.insertBeginning(10);
        list.insertBeginning(15);
        System.out.println(list.getSize());
        list.printList();
    }

}