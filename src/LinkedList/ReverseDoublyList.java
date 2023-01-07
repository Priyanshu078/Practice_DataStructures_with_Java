package LinkedList;

public class ReverseDoublyList {
    static Doublynode reverseDoublyList(Doublynode head){
        Doublynode curr = head;
        Doublynode prev = null;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }
}
