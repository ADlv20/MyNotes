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

    public void insertFirst(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
        size++ ;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node currentNode;
        if (head == null){
            head = node;
            return;
        }
        size++;
        currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = node;
    }

    public void printList(){
        Node node = head;
        if (head == null){
            System.out.println("Empty Linked List");
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
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertLast(200);
        list.printList();
    }

}