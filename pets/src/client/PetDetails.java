package client;

import database.PetInfo;
import model.Pet;

public class PetDetails {

    static PetInfo info = new PetInfo();

    public static void main(String[] args) {
        search("Labrador Retriever");
        search("German Shepherd");
    }

    private static void search(String breed) {
        Pet lab = info.getPet(breed);
        System.out.println("Breed: " + lab.breed);
        System.out.println(("Description: " + lab.description));
    }
}
