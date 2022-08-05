public class Organic_Cat extends Organic_Pet{
    public Organic_Cat(String name, int boredomLevel, int hungerLevel, int thirstLevel, int soilLevel) {
        super(name, boredomLevel, hungerLevel, thirstLevel, soilLevel);
    }

    @Override
    public void greeting() {
        System.out.println("Your living cat is named "+name+" their litter box soil level is "+soilLevel+", their thirst is "+
                thirstLevel + ", their boredom at " + boredomLevel + ", and hunger at " + hungerLevel);
    }
}
