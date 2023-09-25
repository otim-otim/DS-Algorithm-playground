import java.util.Arrays;
import java.util.Stack;

public class StackQueue {

    Stack<Integer> stackQueue = new Stack<Integer>();

    Stack<Integer> backUpQueue = new Stack<Integer>();
    int size = 0;
    int count = 0;
    public StackQueue(int size){
        this.size = size;

    }

    public void enqueue(int item){
        if(isFull()) throw new  IllegalStateException();
        stackQueue.push(item);
        count++;
    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();

        while(stackQueue.size() != 1)
            backUpQueue.push(stackQueue.pop());

        int item = stackQueue.pop();
        while(!backUpQueue.isEmpty())
            stackQueue.push(backUpQueue.pop());
        return item;
    }

    public boolean isFull(){
        return stackQueue.size() == size;
    }

    public boolean isEmpty(){
        return stackQueue.size() == 0;
    }

    public void printQueue(){
        System.out.println("current queue list: " + stackQueue.toString());
    }
}
