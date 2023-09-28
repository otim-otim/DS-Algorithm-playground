public class PriorityQueue {
    private int[] queue;
    public int count = 1;

    public PriorityQueue(int indeces){
        queue  = new int[indeces];
    }

    private  void addItem(int item) {
        if(count == queue.length) throw new IllegalStateException();
        for(int i = count-1; i==0; i-- ){
            if(queue[i] > item){
                queue[i+1] = queue[i];
                queue[i] = item;

            }else{
                queue[i+1] = item;
                break;
            }
        }
        count++;
    }
}
