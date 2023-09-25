import java.util.Arrays;

public class ArrayQueue {
    int[] arrayQueue;
    int front = 0;
    int rear = 0;

    int count = 0;
    public ArrayQueue(int index){
        this.arrayQueue = new int[index];
    }

    public void enqueue(int item){
        if(isFull()) throw new IllegalStateException();
        arrayQueue[rear] = item;
        count++;
        rear =  (rear + 1) % arrayQueue.length;
    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();
        int item = arrayQueue[front];
        arrayQueue[front] = 0;
        count--;
        front  = (front + 1) % arrayQueue.length;
        return item;
    }

    public boolean isFull(){
        return count == arrayQueue.length;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int peek(){
        return arrayQueue[front];
    }

    public void printQueue(){
        System.out.println("the array queue: "+ Arrays.toString(arrayQueue));
    }

//    public void
}
