public class Computer {
    private String cpu;
    private int ram;
    private String hardDrive;
    private String gpu;
    private String os;

    public void addCpu(String cpu){
        this.cpu = cpu;
    }
    public void addRam (int ram){
        this.ram = ram;
    }
    public void addHardDrive(String hardDrive){
        this.hardDrive = hardDrive;
    }
    public void addGpu (String gpu){
        this.gpu=gpu;
    }
    public void addOs (String os){
        this.os = os;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("CPU: ").append(cpu).append("\n");
        sb.append("GPU: ").append(gpu).append("\n");
        sb.append("RAM: ").append(ram).append("\n");
        sb.append("Hard drive: ").append(hardDrive).append("\n");
        sb.append("OS: ").append(os).append("\n");
        return sb.toString();
    }
}
