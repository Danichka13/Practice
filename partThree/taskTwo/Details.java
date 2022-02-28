package partThree.taskTwo;

public abstract class Details {

    private String name;
    private int size;

    public Details(){
        this.name = "";
        this.size = 0;
    }

    public Details(String name) {
        this.name = name;
    }

    public Details(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

}
