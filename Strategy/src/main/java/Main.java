public class Main {

    public static long sort(SortingContext sorter, int[] arr){
        long startTime = System.nanoTime();
        sorter.sortInts(arr);
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }


    public static void main(String[] args) {
        SortingContext sorter = new SortingContext(new HeapSorting());

        int[] shortArray = new int[30];
        int[] longArray = new int[50000];
        for(int i = 0; i<shortArray.length;i++){
            shortArray[i] = (int)(Math.random()*101);
        }
        for(int i = 0; i<longArray.length;i++){
            longArray[i] = (int)(Math.random()*101);
        }

        int[] shortArray2 = shortArray.clone();
        int[] shortArray3 = shortArray.clone();
        int[] longArray2 = longArray.clone();
        int[] longArray3 = longArray.clone();

        long shortHeap = sort(sorter,shortArray);
        long longHeap = sort(sorter,longArray);
        sorter.setStrategy(new BubbleSorting());
        long shortBubble = sort(sorter,shortArray2);
        long longBubble = sort(sorter,longArray2);
        sorter.setStrategy(new MergeSorting());
        long shortMerge = sort(sorter,shortArray3);
        long longMerge = sort(sorter,longArray3);

        System.out.println("Time elapsed for short arrays: ");
        System.out.println(shortHeap/10e6 + " heap " + shortBubble/10e6 + " bubble " + shortMerge/10e6 + " merge");
        System.out.println("Time elapsed for long arrays: ");
        System.out.println(longHeap/10e6 + " heap " + longBubble/10e6 + " bubble " + longMerge/10e6 + " merge");

    }
}
