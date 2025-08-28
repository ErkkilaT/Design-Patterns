public class ButtonB extends Button{
    public ButtonB(String l){
        super(l);
    }
    @Override
    public void display() {

        System.out.println("{[ " + label +" ]}");
    }
}