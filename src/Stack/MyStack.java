package Stack;

public class MyStack {
    int top = 0;
    int size;
    int[] arr;

    MyStack(int size){
        top = -1;
        this.size = size;
        arr = new int[size];
    }

    public void printl(){
        for (int a:
             arr) {
            System.out.print(a + " ");
        }
    }

    public void push(int num){
        if(top < arr.length-1) {
            top++;
            arr[top] = num;
        }
        else{
            System.out.println("OVERFLOW CASE");
        }
    }

    public int pop(){
        if(top > -1) {
            int pop = arr[top];
            arr[top] = 0;
            top--;
            return pop;
        }
        else{
            System.out.println("UNDERFLOW CASE");
            return -1;
        }
    }

    public int peek(){
        return arr[top];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}

