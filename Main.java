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

        System.out.println("Prepend: \n");
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast());

        myLinkedList.prepend(5);
        myLinkedList.printList();

        System.out.println("First Item Removed is: " + myLinkedList.removeFirst().value);

        System.out.println("Get Element from Index 2: " + myLinkedList.getIndex(2).value);

        System.out.println("Get Element from Index 4: " + myLinkedList.getIndex(4));

        myLinkedList.setValue(2, 6);

        myLinkedList.setValue(2, 6); //will return false and not execute

        myLinkedList.printList();

        myLinkedList.insert(4, 7);
        myLinkedList.insert(2, 8);
        myLinkedList.insert(0, 9);

        System.out.println("After Inserting Value: \n ");
        myLinkedList.printList();

        System.out.println("Remove element at Index 3: " +myLinkedList.remove(3).value);
        System.out.println("Remove element at Index 0: " +myLinkedList.remove(0).value);
        System.out.println("remove last element: " +myLinkedList.remove(4).value);

        System.out.println("After removing Value: \n ");
        myLinkedList.printList();

        System.out.println("remove last element: " +myLinkedList.remove(4));

        myLinkedList.reverse();

        System.out.println("List After reverse");
        myLinkedList.printList();
    }
}
