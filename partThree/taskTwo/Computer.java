package partThree.taskTwo;

public class Computer {

    private int virus;

    private Winchester winchester;
    private Memory memory;
    private Processor processor;

    public Computer() {
        this.winchester = new Winchester();
        this.memory = new Memory();
        this.processor = new Processor();
    }

    public Computer(Winchester winchester, Memory memory, Processor processor) {
        this.winchester = winchester;
        this.memory = memory;
        this.processor = processor;
    }

    public void setWinchester(Winchester winchester) {
        this.winchester = winchester;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Winchester getWinchester() {
        return winchester;
    }

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public int getVirus() {
        return virus;
    }

    public void on(){
        System.out.println("Компьютер включен");
    }

    public void off(){
        System.out.println("Компьютер выключен");
    }

    public boolean checkVirus() {
        return virus != 0;
    }

    public void deleteVirus() {
        virus = 0;
    }

    public void printSizeWinMem() {
        System.out.printf("Размер винчестера: %d\nРазмер оперативной памяти: %d", winchester.getSize(), memory.getSize());
    }

    public void printVirus() {
        if (checkVirus()) {
            System.out.println("Вирусы есть");
        } else {
            System.out.println("Вирусов нет");
            virus = (int) ((Math.random() * 10) % 2);
        }
    }
}
