import java.util.Arrays;

public class PriorityQueue {
    private int[] queue;
    public int count = 0;

    public PriorityQueue(int indeces){
        queue  = new int[indeces];
    }

    public  void addItem(int item) {
        if(count >= queue.length) {

            throw new IllegalStateException();
        }
        shiftItemsToInsert(item);
        count = count >= queue.length - 1 ? count : count+ 1;
    }

    private void shiftItemsToInsert(int item) {
        for(int i = count; i >= 0; i-- ){
            if(queue[i] == 0 ){
                queue[i] = item;
                continue;
            }
            if(queue[i] > item){
                queue[i+1] = queue[i];
                queue[i] = item;
            }else{
                queue[i+1] = item;
                break;
            }
        }
    }

    public void printQueue(){
        System.out.println("current priority queue list: " + Arrays.toString(queue));
    }

    public void removeItem(){
        if(count == 0) throw new IllegalStateException();
        for(int i = 0; i <= count ; i++){
            queue[i] = queue[ i+1 < queue.length ? i+1: i];
        }
        queue[count--] = 0;


    }
}
