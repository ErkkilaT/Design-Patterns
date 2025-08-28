public class CheckboxB extends Checkbox{
    public CheckboxB(String l){
        super(l);
    }
    @Override
    public void display() {
        System.out.println("[ ] " + label);
    }
}