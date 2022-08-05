public abstract class Organic_Pet extends Virtual_Pet implements Tick {
    protected int hungerLevel;
    protected int thirstLevel;
    protected int soilLevel;


    public Organic_Pet(String name, int boredomLevel, int hungerLevel, int thirstLevel, int soilLevel) {
        super(name, boredomLevel);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.soilLevel = soilLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getSoilLevel() {
        return soilLevel;
    }

    public void water() {
        thirstLevel = -1;
    }
    public void feed() {
        hungerLevel = -1;
    }
    public void clean() {
        soilLevel = -1;
    }

    public void tick() {
        super.tick();
        hungerLevel++;
        thirstLevel++;
        soilLevel++;
    }

    public boolean isAlive(){
        if (hungerLevel == 10 || thirstLevel == 10 || boredomLevel == 10 || soilLevel == 10) {
            return false;
        }
        return true;
    }





}
