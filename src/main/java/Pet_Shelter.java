
import java.util.ArrayList;



public class Pet_Shelter {
    private ArrayList<Virtual_Pet> PetShelter;

    public Pet_Shelter(ArrayList<Virtual_Pet> petShelter) {
        PetShelter = petShelter;
    }

    public Pet_Shelter() {
        PetShelter = new ArrayList<>();
        PetShelter.add(new Organic_Dog("Calzone", 3, 3, 3, 3));
        PetShelter.add(new Organic_Cat("Misses Fluffy Bottoms", 3, 3, 3, 3));
        PetShelter.add(new Robot_Dog("Ratchet", 3, 5, 5));
        PetShelter.add(new Robot_Cat("Clank", 3, 5, 5));
    }

    public ArrayList<Virtual_Pet> getPetShelter() {
        return PetShelter;
    }

    public int petShelterPopulation() {
        return PetShelter.size();
    }


    public void admitRoboticDog(String name) {
        PetShelter.add(new Robot_Dog(name, 2, 8, 8));
    }

    public void admitRoboticCat(String name) {
        PetShelter.add(new Robot_Cat(name, 2, 8, 8));
    }

    public void admitOrganicDog(String name) {
        PetShelter.add(new Organic_Dog(name, 2, 2, 2, 2));
    }

    public void admitOrganicCat(String name) {
        PetShelter.add(new Organic_Cat(name, 2, 2, 2, 2));
    }

    public void adoptPet(String name) {
        PetShelter.remove(findPetByName(name));
    }

    public Virtual_Pet findPetByName(String name) {
        for (Virtual_Pet temporaryPet : PetShelter) {
            if (temporaryPet.getName().equalsIgnoreCase(name)) {
                return temporaryPet;
            }
        }
        return null;
    }

    public void playAll(){
        for( Virtual_Pet pet: PetShelter) {
            pet.play();
        }
    }

    public void showAllPetStatus() {
        for (Virtual_Pet pet : PetShelter) {
            pet.greeting();
        }
    }

    public void feedAll() {
        for (Virtual_Pet pet : PetShelter) {
            if (pet instanceof Organic_Pet) {
                ((Organic_Pet)pet).feed();
            }
        }

    }

    public void waterAll() {
        for (Virtual_Pet pet : PetShelter) {
            if (pet instanceof Organic_Pet) {
                ((Organic_Pet)pet).water();
            }
        }

    }

    public void cleanAll() {
        for (Virtual_Pet pet : PetShelter) {
            if (pet instanceof Organic_Pet) {
                ((Organic_Pet)pet).clean();
            }
        }

    }

    public void oilAll() {
        for (Virtual_Pet pet : PetShelter) {
            if (pet instanceof Robotic_Pet) {
                ((Robotic_Pet)pet).oil();
            }
        }

    }

    public void maintenanceAll() {
        for (Virtual_Pet pet : PetShelter) {
            if (pet instanceof Robotic_Pet) {
                ((Robotic_Pet)pet).maintenance();
            }
        }

    }

    public void walkAll() {
        for (Virtual_Pet pet: PetShelter){
            if(pet instanceof Walking) {
                ((Walking)pet).walk();
            }
        }
    }

    public void tickAll() {
        for (Virtual_Pet pet: PetShelter){
            if(pet instanceof Tick) {
                ((Tick)pet).tick();
            }
        }
    }

    public boolean areAllPetsAlive(){
        for(Virtual_Pet pet:PetShelter){
            if(!pet.isAlive()){
                return false;
            }
        }
        return true;
    }
}
