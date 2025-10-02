import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
    private FibonacciSequence seq;
    private int current;
    private int last;
    public FibonacciIterator(FibonacciSequence seq){
        this.seq = seq;
        current = 0;
        last = 1;
    }
    @Override
    public boolean hasNext(){
        return current < 1200000000;
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        int next = seq.getNext(current,last);
        last = current;
        current = next;
        return current;
    }
}
