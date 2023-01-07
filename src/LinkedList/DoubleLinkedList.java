package LinkedList;

class Doublynode{
    int data;
    Doublynode next;
    Doublynode prev;

    Doublynode(int d){
        data = d;
        next = null;
        prev = null;
    }
}


public class DoubleLinkedList {
    public static void main(String[] args) {
        Doublynode head = new Doublynode(5);
        Doublynode n2 = new Doublynode(6);
        Doublynode n3 = new Doublynode(7);
        n2.prev = head;
        head.next = n2;
        n2.next = n3;
        n3.prev = n2;

        Doublynode doublynode = InsertAtBeginDoubly.insertAtBegindoubly(head,10);
        Doublynode doublynod1 =ReverseDoublyList.reverseDoublyList(doublynode);
        while(doublynod1 != null){
            System.out.print(doublynod1.data + " ");
            doublynod1 = doublynod1.next;
        }
    }
}
