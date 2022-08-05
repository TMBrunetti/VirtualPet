public class Organic_Dog extends Organic_Pet implements Walking{
    public Organic_Dog(String name, int boredomLevel, int hungerLevel, int thirstLevel, int soilLevel) {
        super(name, boredomLevel, hungerLevel, thirstLevel, soilLevel);
    }
    public void walk(){
        boredomLevel = -1;
        thirstLevel = getThirstLevel() +1;
        hungerLevel = getHungerLevel() +1;
        soilLevel = -1;
    }

    @Override
    public void greeting() {
        System.out.println("Your living dog is named "+name+" their cage soil level is "+soilLevel+", their thirst is "+
                thirstLevel + ", their boredom at " + boredomLevel + ", and hunger at " + hungerLevel);
    }
}