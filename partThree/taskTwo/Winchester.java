package partThree.taskTwo;

public class Winchester {

    private String name;
    private int size;
    private int speed;
    private double weight;

    public Winchester() {
        this.name = "";
        this.size = 0;
        this.speed = 0;
        this.weight = 0;
    }

    public Winchester(String name, int size, int speed, double weight) {
        this.name = name;
        this.size = size;
        this.speed = speed;
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }
}
