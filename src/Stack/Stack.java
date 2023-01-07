package Stack;

public class Stack {
    public static void main(String[] args) {
//        MyStack stack = new MyStack(10);
//        for(int i = 0;i<10;i++){
//            stack.push(i);
//        }
//        stack.printl();
//        System.out.println();
//        stack.push(11);
//        stack.printl();
//        System.out.println();
//        stack.pop();
//        System.out.println();
//        stack.pop();
//        System.out.println();
//        int pop = stack.pop();
//        System.out.println(pop);
//        stack.printl();
//        System.out.println();
//        int size = stack.size();
//        System.out.println(size);
//        int top = stack.peek();
//        System.out.println(top);
//        stack.push(13);
//        stack.printl();
//        System.out.println();
//        int topNew = stack.peek();
//        System.out.println(topNew);
//        int sizeNew = stack.size();
//        System.out.println(sizeNew);

        StackUsingLinkedList stack = new StackUsingLinkedList(10);
        stack.push(12);
        stack.push(13);
        int pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push(8);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
