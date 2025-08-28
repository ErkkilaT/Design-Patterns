abstract class Checkbox {
    protected String label;
    public Checkbox(String s){
        label = s;
    }
    abstract void display();
    void setText(String text){
        label = text;
    }
}