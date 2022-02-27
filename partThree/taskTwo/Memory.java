package partThree.taskTwo;

public class Memory {

    private String name;
    private int size;
    private int frequency;

    public Memory(){
        this.name = "";
        this.size = 0;
        this.frequency = 0;
    }

    public Memory(String name, int size, int frequency){
        this.name = name;
        this.size = size;
        this.frequency = frequency;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public long getFrequency() {
        return frequency;
    }
}
