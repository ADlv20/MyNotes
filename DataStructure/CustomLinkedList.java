package DataStructure;

public class CustomLinkedList {

    private Node head;
    private int size;
    private Node tail;

    public CustomLinkedList(){
        this.size = 0;
    }

    public int getTail() {
        return tail.data;
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
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++ ;
    }

    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public Node getNode(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteFirst(){
        if (head== null){
            System.out.println("Empty List");
            return;
        }
        size--;
        head = head.next;
    }

    public int nextNextNext(){
        Node node = head;

        return node.next.next.next.data;
    }

    public void deleteLast(){

        int deletedVal = tail.data;

        Node node = getNode(size-2);
        tail = node;
        tail.next = null;
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
        System.out.println();
    }

    public void printList(Node node){
        Node tempNode = node;
        while (tempNode != null){
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);

        int[] nums = {0,2,1};
        System.out.println(list.numComponents(list.head,nums));
    }

    // Easy Questions
    public boolean hasCycle(Node head) {
        // Single Element
        if(head == null || head.next == null)
            return false;

        // Two Pointer Technique
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;

            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    public Node reverseList(Node head) {

        if (head==null)
            return head;

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            System.out.println(prev.data);
        }
        return prev;
    }

    // Leet Code 817. Linked List Components
    public int numComponents(Node head, int[] nums) {
        int m = nums.length;
        if(m == 0) {
            return 0;
        }
        boolean[] exists = new boolean[100001];

        for (int num : nums) {
            exists[num] = true;
        }
        int ans = 0;
        boolean prevPresent = false;
        while(head != null) {
            if(exists[head.data]){
                if(!prevPresent) ans++;
                prevPresent = true;
            }
            else prevPresent = false;
            head = head.next;
        }
        return ans;
    }
}
