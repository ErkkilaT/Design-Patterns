public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void setStrategy(SortingStrategy ss){
        this.sortingStrategy = ss;
    }
    public int[] sortInts(int[] ints){
        return sortingStrategy.sort(ints);
    }
}
