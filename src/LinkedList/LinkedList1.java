package LinkedList;
public class LinkedList1 {

    static class Node{
        int data;
        Node next;

        Node(int n){
            data = n;
            next = null;
        }
    }

    static void linked(){
        Node head = new Node(4);
        Node n2 = new Node(5);
        Node n3 = new Node(6);
        head.next = n2;
        n2.next = n3;
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
             curr = curr.next;
        }
    }
}
