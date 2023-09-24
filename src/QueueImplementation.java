import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueImplementation {
    public Queue<Integer> queue;
    public QueueImplementation(Queue<Integer> queue){
        this.queue = queue;
    }

   public static void reverse(Queue<Integer> queue){
        if(queue.isEmpty()) return;
       Stack<Integer> stack = new Stack<Integer>();
       while(!queue.isEmpty()){
           stack.push(queue.remove());
       }
       while(!stack.isEmpty()){
           queue.add(stack.pop());
       }

    }
}
