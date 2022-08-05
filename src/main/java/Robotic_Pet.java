public abstract class Robotic_Pet extends Virtual_Pet implements Tick {
    public Robotic_Pet(String name, int boredomLevel) {
        super(name, boredomLevel);
    }

    protected int oilLevel;
    protected int maintenanceLevel;

    public Robotic_Pet(String name, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, boredomLevel);
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void oil(){oilLevel= 11;}

    public void maintenance(){maintenanceLevel = 11;}

    public void tick() {
        super.tick();
        oilLevel--;
        maintenanceLevel--;

    }

    public boolean isAlive() {
        if (boredomLevel == 10 || maintenanceLevel == 0 || oilLevel == 0) {
            return false;
        }
        return true;
    }

}