public interface ComputerBuilder {
    void buildCpu();
    void buildRam();
    void buildHardDrive();
    void buildGpu();
    void buildOs();
    Computer getComputer();
}
