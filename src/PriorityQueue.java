import java.util.Arrays;

public class PriorityQueue {
    private int[] queue;
    public int count = 0;

    public PriorityQueue(int indeces){
        queue  = new int[indeces];
    }

    public  void addItem(int item) {
        if(count >= queue.length) throw new IllegalStateException();

        else{
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
        count++;
    }

    public void printQueue(){
        System.out.println("current priority queue list: " + Arrays.toString(queue));
    }
}
