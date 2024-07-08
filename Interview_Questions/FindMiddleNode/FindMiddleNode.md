# Find Kth From End Function
``` java
public Node findMiddleNode(){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
         
        slow = slow.next;
        fast = fast.next.next;
            
    }
    return slow;
}
```
# Algorithm and Explanation

## Algorithm

1. Initialization:

    - Start with two pointers, slow and fast, both pointing to the head of the linked list.

2. Traverse the Linked List:

    - Move the slow pointer one step at a time (slow = slow.next).
    - Move the fast pointer two steps at a time (fast = fast.next.next).

3. Condition to Continue:

    - Continue the traversal as long as fast is not null and fast.next is not null.

4. Middle Node:

    - When the fast pointer reaches the end of the list (or the node before the end for even-length lists), the slow pointer will be at the middle node of the linked list.

5. Return the Middle Node:

    - Return the node pointed to by the slow pointer.

## Pseudocode:

``` java
function findMiddleNode()
    slow ← head
    fast ← head
    while fast ≠ null and fast.next ≠ null
        slow ← slow.next
        fast ← fast.next.next
    return slow
```