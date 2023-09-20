import java.util.ArrayList;

public class ManualStack {
    private ArrayList<Integer> list = new ArrayList();

    public void push(int item){
        list.add(item);
    }

    public void pop(){
        list.remove(list.size() - 1);
    }

    public int peek(){
        return list.get(list.size() - 1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
