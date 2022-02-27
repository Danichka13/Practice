package partThree.taskTwo;

public class taskTwo {
    public static void main(String[] args) {

        Computer comp = new Computer();

        Winchester winchester = new Winchester("Western Digital", 1000, 7200, 0.5);
        Memory memory = new Memory();
        memory.setName("Ballistix");
        memory.setSize(16);
        memory.setFrequency(2666);
        Processor processor = new Processor("AMD Ryzen 5 2400G", 4, 8, 3.6);

        comp.setWinchester(winchester);
        comp.setMemory(memory);
        comp.setProcessor(processor);

        comp.actDeact();
        System.out.println(comp.checkVirus());
        comp.printSizeWinMem();
        System.out.println();
        comp.printVirus();
        comp.actDeact();
    }
}
