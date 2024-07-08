package DoubleLinkedList.Interview_questions_DLL.SwapFirstAndLast;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList(1);
        
        myList.append(2);

        System.out.println("2 Elements Before Swap");
        myList.printList();

        myList.SwapFirstAndLast();

        System.out.println("2 Elements After Swap");

        myList.printList();

        myList.append(3);

        System.out.println("Elements after adding 1 Element");

        myList.printList();

        myList.SwapFirstAndLast();

        System.out.println("Elements after adding 1 Element & Swapping");

        myList.printList();
    }
}
