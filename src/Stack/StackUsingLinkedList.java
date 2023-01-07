package Stack;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int d){
        this.data = d;
        next = null;
        prev = null;
    }
}

public class StackUsingLinkedList {
     Node head;
     Node top;
     int size = 1;

     StackUsingLinkedList(int num){
         head = new Node(num);
         top = head;
     }

     public void push(int num){
         Node node = new Node(num);
         top.next = node;
         node.prev = top;
         top = node;
         size++;
     }

     public int pop(){
         int data = top.data;
         top = top.prev;
         size--;
         return data;
     }

     public int size(){
         return size;
     }

     public int peek(){
         return top.data;
     }

     public boolean isEmpty(){
         return top == null;
    }
}
