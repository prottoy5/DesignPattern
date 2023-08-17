// Facade class
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void startComputer() {
        memory.loadMemory();
        hardDrive.readData();
        cpu.processData();
        System.out.println("Computer is starting.");
    }
}
