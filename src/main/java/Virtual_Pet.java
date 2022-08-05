public abstract class Virtual_Pet implements Tick {
    protected String name;
    protected int boredomLevel;

    public Virtual_Pet(String name, int boredomLevel) {
        this.name = name;
        this.boredomLevel = boredomLevel;
    }

    public String getName() {
        return name;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }
    public void play() {
        boredomLevel = -1;
    }

    public void tick() {
        boredomLevel++;
    }
    public abstract void greeting();

    public abstract boolean isAlive();

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }
}
