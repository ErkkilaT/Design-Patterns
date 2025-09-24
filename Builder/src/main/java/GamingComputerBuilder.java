public class GamingComputerBuilder implements ComputerBuilder{
    private Computer computer;
    public GamingComputerBuilder(){
        computer = new Computer();
    }
    @Override
    public void buildCpu() {
        computer.addCpu("i7 12700K");
    }

    @Override
    public void buildRam() {
        computer.addRam(32);
    }

    @Override
    public void buildHardDrive() {
        computer.addHardDrive("2TB M.2 NVMe");
    }

    @Override
    public void buildGpu() {
        computer.addGpu("GeForce RTX 5080");
    }

    @Override
    public void buildOs() {
        computer.addOs("Windows 11 Home");
    }

    public Computer getComputer(){
        return computer;
    }
}
