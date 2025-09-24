public class ComputerDirector {
    private ComputerBuilder builder;
    public ComputerDirector(ComputerBuilder builder){
        this.builder = builder;
    }

    public void constructComputer(){
        builder.buildCpu();
        builder.buildGpu();
        builder.buildRam();
        builder.buildOs();
        builder.buildHardDrive();
    }


}
