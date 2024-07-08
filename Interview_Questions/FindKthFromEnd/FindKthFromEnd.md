# Find Kth From End Function
``` java
    public Node findKthFromEnd(int k){
        Node slow = head;
        Node fast = head;
        
        for(int i =0; i<k; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
```
# Algorithm and Explanation

## Algorithm

1. Initialize Pointers:

    - Initialize two pointers, slow and fast, both pointing to the head of the linked list.

2. Move Fast Pointer k Steps Ahead:

    - Move the fast pointer k steps ahead in the linked list.

    - If during this process, the fast pointer becomes null, it means k is larger than the length of the list. In this case, return null.

3. Move Both Pointers Until Fast Reaches the End:

    - Move both slow and fast pointers one step at a time until the fast pointer reaches the end of the list (fast becomes null).

4. Return Slow Pointer:

    - At this point, the slow pointer will be pointing to the k-th node from the end of the list. Return the slow pointer.

## Pseudocode:

``` java
function findKthFromEnd(head, k):
    slow = head
    fast = head
    
    // Move fast pointer k steps ahead
    for i from 0 to k-1:
        if fast == null:
            return null
        fast = fast.next
    
    // Move both pointers until fast reaches the end
    while fast != null:
        slow = slow.next
        fast = fast.next
    
    return slow
```