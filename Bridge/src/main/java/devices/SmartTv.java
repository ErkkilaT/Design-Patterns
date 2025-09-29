package devices;

public class SmartTv extends Tv{
    private boolean netflix = false;

    @Override
    public void toggleNetflix(){
        netflix = !netflix;
    }
    @Override
    public void printStatus(){
        super.printStatus();
        System.out.println("| This tv is smart");
        System.out.println("| Smart features:");
        System.out.println("| Netflix is " + (netflix ? "on" : "off"));
        System.out.println("------------------------------------\n");
    }
}
