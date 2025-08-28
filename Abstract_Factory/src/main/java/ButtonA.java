public class ButtonA extends Button {
    public ButtonA(String l){
        super(l);
    }
    @Override
    public void display() {
        System.out.println("_______________________");
        System.out.println("| " + label + " |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }
}
