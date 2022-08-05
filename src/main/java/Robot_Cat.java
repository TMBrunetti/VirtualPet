public class Robot_Cat extends Robotic_Pet {
    public Robot_Cat(String name, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, boredomLevel, oilLevel, maintenanceLevel);
    }

    @Override
    public void greeting() {
        System.out.println("Your robotic cat is named "+name+" their overall maintenance is "+ maintenanceLevel +
                ", oil level at " + oilLevel + ", and their boredom at " + boredomLevel );
    }
}
