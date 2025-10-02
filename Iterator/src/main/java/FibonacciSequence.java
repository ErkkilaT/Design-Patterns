import java.util.Iterator;

public class FibonacciSequence implements Sequence{

    public Iterator<Integer> iterator(){
        return new FibonacciIterator(this);
    }
    public int getNext(int current, int last){
        return current+last;
    }
}
