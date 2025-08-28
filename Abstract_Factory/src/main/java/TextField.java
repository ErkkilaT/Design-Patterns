abstract class TextField {
    protected String label;

    public TextField(String s) {
        label = s;
    }

    abstract void display();

    void setText(String text) {
        label = text;
    }
}