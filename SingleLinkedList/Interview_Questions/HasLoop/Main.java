package Interview_Questions.HasLoop;

public class Main{
    public static void main(String[] args) {
        HasLoop myList = new HasLoop(1);

        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        
        myList.getTail().next = myList.getHead();

        System.out.println("Has Loop: "+ myList.hasLoop());

        myList.getTail().next = null;

        System.out.println("Has Loop: "+ myList.hasLoop());

    }
}