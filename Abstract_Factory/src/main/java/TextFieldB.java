public class TextFieldB extends TextField{
    public TextFieldB(String s) {
        super(s);
    }
    @Override
    public void display() {
        System.out.println("[_________________________]  " + label);
    }
}