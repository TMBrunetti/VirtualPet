

import java.util.Scanner;


public class App {

    public static void main(String[] ars) {

        Pet_Shelter shelter = new Pet_Shelter();

        String userInput = "";
        Scanner input = new Scanner(System.in);

        while (shelter.areAllPetsAlive() && !userInput.equalsIgnoreCase("quit")) {
            shelter.showAllPetStatus();
            System.out.println("Type 'feed', 'water', 'play','clean', 'walk' , 'oil', 'maintenance',  'admit', 'adopt', or 'interact' with single pet.");
            System.out.println("Game ends when you type 'quit' or you kill a pet");
            userInput = input.nextLine();

            switch (userInput.toLowerCase()) {
                case "feed":
                    shelter.feedAll();
                    break;

                case "water":
                    shelter.waterAll();
                    break;

                case "play":
                    shelter.playAll();
                    break;

                case "clean":
                    shelter.cleanAll();
                    break;

                case "maintenance":
                    shelter.maintenanceAll();
                    break;

                case "oil":
                    shelter.oilAll();
                    break;

                case "walk":
                    shelter.walkAll();
                    break;

                case "adopt":
                    System.out.println("Enter the name of the pet you want to adopt.");
                    shelter.adoptPet(input.nextLine());
                    break;

                case "admit":
                    System.out.println("Choose Number 1. Robotic Dog, 2. Organic Dog, 3.Robotic Cat, 4. Organic Cat ");
                    userInput = input.nextLine();
                    switch ((userInput)) {
                        case "1":
                            System.out.println("enter name");
                            shelter.admitRoboticDog(input.nextLine());
                            break;
                        case "2":
                            System.out.println("enter name");
                            shelter.admitOrganicDog(input.nextLine());
                            break;
                        case "3":
                            System.out.println("enter name");
                            shelter.admitRoboticCat(input.nextLine());
                            break;
                        case "4":
                            System.out.println("enter name");
                            shelter.admitOrganicCat(input.nextLine());
                            break;
                    }
                    break;

                case "interact": {
                    System.out.println("choose a Pet");
                    userInput = input.nextLine();
                    Virtual_Pet pet = shelter.findPetByName(userInput);
                    displayPetOptions(pet);
                    userInput = input.nextLine();

                    switch (userInput) {
                        case "1":
                            if (pet instanceof Organic_Pet) {
                                ((Organic_Pet) pet).feed();
                            } else {
                                ((Robotic_Pet) pet).oil();
                            }
                            break;
                        case "2":
                            if (pet instanceof Organic_Pet) {
                                ((Organic_Pet) pet).clean();
                            } else {
                                ((Robotic_Pet) pet).maintenance();
                            }
                            break;
                        case "3":
                            if (pet instanceof Organic_Pet) {
                                ((Organic_Pet) pet).play();
                            } else {
                                ((Robotic_Pet) pet).play();
                            }
                            break;
                        case "4":
                            if (pet instanceof Organic_Pet) {
                                ((Organic_Pet) pet).water();
                            } else {
                                System.out.println("You can't water robotic pets, it short circuited, causing an explosion, taking everyone with it");
                                pet.setBoredomLevel(9);
                            }
                            break;
                        case "5":
                            if (pet instanceof Walking) {
                                ((Walking) pet).walk();
                            } else {
                                System.out.println("Cats will never be walked, in defiance they burnt down your shelter");
                                pet.setBoredomLevel(9);
                            }
                            break;

                    }
                    break;

                }

            }
            shelter.tickAll();

        }
        input.close();
        System.out.println("Thank you for playing");
    }


    public static void displayPetOptions(Virtual_Pet pet) {
        if (pet instanceof Robot_Dog) {
            System.out.println("Robotic Dog: choose '1' for oil,'2' maintenance,'3' for play,don't water, '5' for walk");
        }
        if (pet instanceof Organic_Dog) {
            System.out.println("Organic Dog: Choose '1' for feed,'2' for clean,'3' for play,'4' water,'5' for walk");
        }
        if (pet instanceof Robot_Cat) {
            System.out.println("Robotic Cat: choose '1' for feed,'2' for maintenance,'3' for play, don't water or walk");
        }
        if (pet instanceof Organic_Cat) {
            System.out.println("Organic Cat: choose '1' for oil,'2' for clean,'3' for play,'4' for water, don't walk");
        }

    }


}