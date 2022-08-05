public class Robot_Dog extends Robotic_Pet implements Walking{
    public Robot_Dog(String name, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, boredomLevel, oilLevel, maintenanceLevel);
    }
    public void walk(){
        boredomLevel = -1;
        oilLevel = getOilLevel() -1;
        maintenanceLevel = getMaintenanceLevel() -1;
    }

    @Override
    public void greeting() {
        System.out.println("Your robotic dog is named "+name+" ,their overall maintenance is "+ maintenanceLevel +
                ", oil level at " + oilLevel + ", and their boredom at " + boredomLevel );
    }
}
