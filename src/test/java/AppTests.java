import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTests {

    @Test
    public void canAdmitOrganicCatToShelter() {
        Pet_Shelter underTest = new Pet_Shelter();
        underTest.admitOrganicCat("Tabby");
        assertTrue(underTest.findPetByName("Tabby") != null);
    }

    @Test
    public void canWalkAllDogs() {
        Pet_Shelter underTest = new Pet_Shelter();
        underTest.walkAll();
        underTest.tickAll();
        for (Virtual_Pet testPet: underTest.getPetShelter()) {
            if (testPet instanceof Walking){
                assertEquals(0, testPet.getBoredomLevel());
            }
        }
    }

    @Test
    public void maintenanceAllPets() {
        Pet_Shelter underTest = new Pet_Shelter();
        underTest.getPetShelter();
        underTest.maintenanceAll();
        underTest.tickAll();
        for ( Virtual_Pet testPet :underTest.getPetShelter()) {
            if (testPet instanceof Robotic_Pet){
                assertEquals(10,((Robotic_Pet)testPet).getMaintenanceLevel());
            }
        }
    }
}