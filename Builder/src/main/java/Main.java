public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.constructComputer();
        Computer pc = builder.getComputer();
        System.out.println(pc);
    }
}
