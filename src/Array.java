public class Array {
    int[] numbers;
    int currentIdx = 0;
    public  Array(int indexes){
        this.numbers = new int[indexes];
    }
    public void insert(int value){
        if(currentIdx < numbers.length){
            numbers[currentIdx] = value;
//            currentIdx = currentIdx == numbers.length -1 ? currentIdx : currentIdx+ 1;
            currentIdx++;
        }else{
//            removeAt(currentIdx);
            int[] newArray = new int[currentIdx * 2];
            for(int i = 0; i < currentIdx; i++  )
                newArray[i] = numbers[i];
            newArray[currentIdx++] = value;
            numbers = newArray;
//            insert(value);
        }
    }

    public void removeAt(int idx){
        if(idx < 0 || idx > currentIdx)
            throw new IllegalArgumentException();
//        int[] stripped
        for(int i=idx; i <= currentIdx; i++)
                numbers[i] = numbers[i + 1];
        currentIdx--;
    }

    public void print(){
        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < currentIdx; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            String formattedString = String.format("value at index %d = %d", i, numbers[i]);
            System.out.println(formattedString);
        }
    }
}
