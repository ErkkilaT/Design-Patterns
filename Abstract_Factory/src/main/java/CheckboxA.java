public class CheckboxA extends Checkbox{
    public CheckboxA(String l){
        super(l);
    }
    @Override
    public void display() {
        System.out.println(" ___");
        System.out.println("|   |  " + label);
        System.out.println(" ‾‾‾");
    }
}