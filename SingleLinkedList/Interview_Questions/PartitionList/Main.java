package SingleLinkedList.Interview_Questions.PartitionList;

public class Main {
    
    public static void main(String[] args) {
        PartitionList myList = new PartitionList(2);

        myList.append(4);
        myList.append(1);
        myList.append(3);
        myList.append(7);
        myList.append(0);

        myList.partitionList(3);

        myList.printAll();
    }

}
