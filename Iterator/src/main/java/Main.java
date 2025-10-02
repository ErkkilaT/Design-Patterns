import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence seq = new FibonacciSequence();
        Iterator it = seq.iterator();
        for(int i = 0; i<10; i++){
            System.out.println(i+1 + ": " + it.next());
        }
        System.out.println();
        Iterator it2 = seq.iterator();
        for(int i = 0; i<50; i++){
            System.out.println(i+1 + ": " + it2.next());
        }
    }
}
