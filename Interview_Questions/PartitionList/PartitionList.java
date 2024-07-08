package Interview_Questions.PartitionList;

public class PartitionList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public PartitionList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x){
        
        if(head == null){
            return;
        }
        
        Node left = new Node(0);
        Node right = new Node(0);
        Node left_pointer = left;
        Node right_pointer = right;
        Node current = head;
        
        while(current != null){
            if(current.value < x){
                left_pointer.next = current;
                left_pointer = current;
            }
            else{
                right_pointer.next = current;
                right_pointer = current;
            }
            current = current.next;
        }
        right_pointer.next = null;
        left_pointer.next = right.next;
        head = left.next;
    }
}