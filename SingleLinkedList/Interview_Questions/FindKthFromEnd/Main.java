package SingleLinkedList.Interview_Questions.FindKthFromEnd;

public class Main {

    public static void main(String[] args) {
 
        FindKthFromEnd myList = new FindKthFromEnd(1);

        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        myList.printList();

        System.out.println("2nd Kth Element From End " +myList.findKthFromEnd(2).value);

        System.out.println("4th Kth Element From End: "+myList.findKthFromEnd(4).value);

        System.out.println("Outside kth Element From End: "+myList.findKthFromEnd(7));

    }   
}