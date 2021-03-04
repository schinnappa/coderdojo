package client;

import database.PetInfo;
import model.Pet;

public class PetDetails {

    static PetInfo info = new PetInfo();

    public static void main(String[] args) {
        search("Labrador Retriever");
        search("German Shepherd");
        search("xyz");
    }

    private static void search(String breed) {
        Pet pet = info.getPet(breed);
        if (pet != null) {
            System.out.println("Breed: " + pet.breed);
            System.out.println(("Description: " + pet.description));
        } else {
            System.out.println("Breed " + breed + " information is not available");
        }
    }
}