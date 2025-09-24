public class OfficeComputerBuilder implements ComputerBuilder{
    private Computer computer;
    public OfficeComputerBuilder(){
        computer = new Computer();
    }
    @Override
    public void buildCpu() {
        computer.addCpu("i9 12900");
    }

    @Override
    public void buildRam() {
        computer.addRam(64);
    }

    @Override
    public void buildHardDrive() {
        computer.addHardDrive("512 Gb SATA SSD");
    }

    @Override
    public void buildGpu() {
        computer.addGpu("None");
    }

    @Override
    public void buildOs() {
        computer.addOs("Windows 11 Professional");
    }
    public Computer getComputer(){
        return computer;
    }

}
