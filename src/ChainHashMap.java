import java.util.LinkedList;

public class ChainHashMap {
    LinkedList<Entry>[] entries;
    public ChainHashMap(int arraySize){
        entries = new LinkedList[arraySize];
    }

    private int hash(int key){
        return key % entries.length;
    }

    public void put(Entry entry){
        int idx = hash(entry.key);
        LinkedList<Entry> bucketList = entries[idx];
        if(bucketList == null) {
            bucketList.addFirst(entry);
            return;
        }
        //if key exists in bucket
        for (Entry bucketEntry : bucketList  ) {
            if(bucketEntry.key == entry.key) {
                bucketEntry.value = entry.value;
                return;
            }

        }
        bucketList.addLast(entry);
    }

    public Entry get(int key){
        int idx = hash(key);
        if(entries[idx] != null){
            for (Entry entry : entries[idx]) {
                if(entry.key == key)
                    return entry;
            }

        }
        return null;
    }

    public void remove(int key){

    }


}
