package DataStructure;

public class CustomLinkedList {

    private Node head;
    private int size;

    public CustomLinkedList(){
        this.size = 0;
    }

    public static class Node{

        private final int data;
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
        size++ ;
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node currentNode;
        size++;
        if (head == null){
            head = node;
            return;
        }
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
        System.out.println(list.getSize());
        list.printList();
    }
}