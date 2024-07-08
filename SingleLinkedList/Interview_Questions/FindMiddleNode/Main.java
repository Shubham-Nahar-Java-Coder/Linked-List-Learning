package SingleLinkedList.Interview_Questions.FindMiddleNode;

public class Main{
    public static void main(String[] args) {
        FindMiddleNode myList = new FindMiddleNode(1);

        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        
        System.out.println(myList.findMiddleNode().value);

        myList.append(6);

        System.out.println("After Appending One More value: "+ myList.findMiddleNode().value);
    }
}