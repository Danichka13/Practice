package partThree.taskThree;

public abstract class ElectricalAppliance {

    private int powerWatt;
    private int active;

    public ElectricalAppliance() {
        this.powerWatt = 0;
        this.active = 0;
    }

    public ElectricalAppliance(int powerWatt) {
        this.powerWatt = powerWatt;
        this.active = 0;
    }

    public void setPowerWatt(int powerWatt) {
        this.powerWatt = powerWatt;
    }

    public int getPowerWatt() {
        return powerWatt;
    }

    public int getActive() {
        return active;
    }

    public String getActiveUser() {
        if (active == 1) {
            return "Включен";
        } else
            return "Выключен";
    }

    public void on() {
        this.active = 1;
        System.out.println("Электроприбор включен");
    }

    public void off() {
        this.active = 0;
        System.out.println("Электроприбор выключен");
    }
}
