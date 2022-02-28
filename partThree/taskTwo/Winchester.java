package partThree.taskTwo;

public class Winchester extends Details {

    private int speed;
    private double weight;

    public Winchester() {
        super();
        this.speed = 0;
        this.weight = 0;
    }

    public Winchester(String name, int size, int speed, double weight) {
        super(name, size);
        this.speed = speed;
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }
}
