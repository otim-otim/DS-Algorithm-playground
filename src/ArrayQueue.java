import java.util.Arrays;

public class ArrayQueue {
    int[] arrayQueue;
    int front = 0;
    int rear = 0;
    public ArrayQueue(int index){
        this.arrayQueue = new int[index];
    }

    public void enqueue(int item){
        if(isFull()) throw new IllegalArgumentException();
        arrayQueue[rear] = item;
        if(!isFull()) rear++;
    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalArgumentException();
        int item = arrayQueue[front];
        arrayQueue[front++] = 0;
        return item;
    }

    public boolean isFull(){
        return rear >= arrayQueue.length;
    }

    public boolean isEmpty(){
        return rear == 0 || front == arrayQueue.length - 1;
    }

    public int peek(){
        return arrayQueue[front];
    }

    public void printQueue(){
        System.out.println("the array queue: "+ Arrays.toString(arrayQueue));
    }
}
