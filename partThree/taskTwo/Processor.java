package partThree.taskTwo;

public class Processor extends Details {

    private int core;
    private int streams;
    private double frequency;

    public Processor() {
        super();
        this.core = 0;
        this.streams = 0;
        this.frequency = 0;
    }

    public Processor(String name, int core, int streams, double frequency) {
        super(name);
        this.core = core;
        this.streams = streams;
        this.frequency = frequency;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public void setStreams(int streams) {
        this.streams = streams;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCore() {
        return core;
    }

    public int getStreams() {
        return streams;
    }

    public double getFrequency() {
        return frequency;
    }
}
