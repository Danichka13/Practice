package partThree.taskTwo;

public class Memory extends Details {

    private int frequency;

    public Memory(){
        super();
        this.frequency = 0;
    }

    public Memory(String name, int size, int frequency){
        super(name, size);
        this.frequency = frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public long getFrequency() {
        return frequency;
    }
}
