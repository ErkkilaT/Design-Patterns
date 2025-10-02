import java.util.Iterator;

public class FibonacciSequence implements Sequence{
    //Keep track of progress in iterator so separate iterators don't conflict with each other
    public Iterator<Integer> iterator(){
        return new FibonacciIterator(this);
    }
    public int getNext(int current, int last){
        return current+last;
    }
}
