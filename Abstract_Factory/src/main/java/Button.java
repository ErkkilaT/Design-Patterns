abstract class Button {
    protected String label;
    public Button(String s){
        label = s;
    }
    abstract void display();
    void setText(String text){
        label = text;
    }
}
