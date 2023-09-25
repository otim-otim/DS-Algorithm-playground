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

    public void dequeue(int idx){
        if(isEmpty()) throw new IllegalArgumentException();
        front++;
    }

    public boolean isFull(){
        return rear == arrayQueue.length - 1;
    }

    public boolean isEmpty(){
        return rear == 0 || front == arrayQueue.length - 1;
    }

    public int peek(){
        return arrayQueue[front];
    }
}