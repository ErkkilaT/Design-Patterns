public class TextFieldA extends TextField{
    public TextFieldA(String s) {
        super(s);
    }
    @Override
    public void display() {
        System.out.println(" ________________________");
        System.out.println("|                        |   " + label);
        System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }
}