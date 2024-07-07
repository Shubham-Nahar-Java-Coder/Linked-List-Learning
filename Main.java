public class Main {
    
    public static void main(String[] args) {
        LinkedListConstructor myLinkedList = new LinkedListConstructor(4);

        myLinkedList.append(3);
        myLinkedList.append(2);
        myLinkedList.append(1);

        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();

        myLinkedList.printList();

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());
    }
}
