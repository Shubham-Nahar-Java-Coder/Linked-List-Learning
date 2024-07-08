package DoubleLinkedList;

public class Main {
    
    public static void main(String[] args) {
        DLLConstructor myList = new DLLConstructor(1);
        // myList.printList();

        // myList.getHead();
        // myList.getTail();
        // myList.getLength();

        myList.append(2);
        myList.append(3);


        // System.out.println(myList.removeLast().value);
        // System.out.println(myList.removeLast().value);
        // System.out.println(myList.removeLast().value);
        // System.out.println(myList.removeLast());

        myList.prepend(0);

        
        myList.printList();

        myList.getHead();
        myList.getTail();
        myList.getLength();
        
        // System.out.println("Remove First: "+myList.removeFirst().value);
        // System.out.println("Remove First: "+myList.removeFirst().value);
        // System.out.println("Remove First: "+myList.removeFirst().value);
        // System.out.println("Remove First: "+myList.removeFirst().value);
        // System.out.println("Remove First: "+myList.removeFirst());

        System.out.println("Get Element from Index: "+myList.get(2).value);

        myList.set(2, -1);

        //myList.printList();

        myList.insert(2, 1);
        
        myList.printList();

        System.out.println("Remove element: "+myList.remove(1).value);

        myList.printList();
    }
}
