package database;

import java.util.ArrayList;
import java.util.List;
import model.Pet;

public class PetInfo {

    public static final List<Pet> pets;

    static {
        pets = new ArrayList<>();
        pets.add(new Pet("Labrador Retriever",
            "The Lab makes his 25th straight appearance as the number one breed. And why not? This family-friendly, smart, and fun-loving breed is a favorite in households across America. Their "
                + "desire to please and gentle disposition also help them excel as guide dogs and search-and-rescue dogs."));
        pets.add(new Pet("German Shepherd",
            "A true dog lover’s pet, the German Shepherd Dog is intelligent and hardworking. They are also known to be extremely versatile and courageous. No wonder they are so often trained to "
                + "assist people with disabilities, the police, the military, and other service organizations."));
        pets.add(new Pet("Golden Retriever",
            "A very athletic breed, the Golden Retriever is another family-friendly pet with a fantastic demeanor. Because they love to run and play, they’re a great fit for families with young children. Also skilled "
                + "workers, Goldens are popular hunting companions, guide dogs, and search-and-rescue dogs."));

        pets.add(new Pet("Bulldog",
            "One of the fastest - growing breeds in terms of popularity, Bulldogs are fun and loveable.They are very calm when compared with the previously mentioned breeds, and they make great companions.They don’t "
                + "need a ton of exercise—they actually prefer to stay home and relax most of the time."));

        pets.add(new Pet("Beagle",
            "Conveniently sized with short, low-maintenance coats, the Beagle is a peaceful and cheerful pet. Unlike Bulldogs, Beagles do require some exercise, so a fenced-in yard is an ideal setting for them. A "
                + "hunting breed with great curiosity, these hounds enjoy exploring and keeping their noses active."));

        pets.add(new Pet("French Bulldog",
            "French Bulldogs have mixed demeanors—sometimes they love to run and play, and sometimes they just want to lie around and be loved. They thrive from human contact and attention, so this isn’t a "
                + "breed to be kept alone for hours at a time."));

        pets.add(new Pet("Yorkshire Terrier",
            "“Yorkies” are the most popular small dog breed in America. They become extremely devoted to their owners, and their small stature makes them a great choice for people who live in condos or "
                + "apartments. They can be a bit feisty at times, but overall this brave and energetic breed is excellent for anyone wanting a small companion. "));

        pets.add(new Pet("Poodle",
            "Poodles are known for making regular appearances in dog shows. Their elegant form never goes unnoticed, but their personalities are just as charming as their looks. They’re smart, easy to train, eager to "
                + "please, and lots of fun to be around."));

        pets.add(new Pet("Rottweiler",
            "Large and powerful, Rottweilers are sometimes misunderstood because of their stature. They are actually very intelligent, easily trained, and willing to work. Their broad chests and muscular bodies "
                + "stand out, but Rottweilers have even bigger hearts and make for devoted companions."));

        pets.add(new Pet("Boxer",
            "Boxers have endless energy and love to play. Although they can be headstrong at times, Boxers are extremely loyal to their owners. They are great with kids while also being alert and courageous."));
    }

    public Pet getPet(String breed) {
        pets.add(new Pet());
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).breed.equals(breed)) {
                return pets.get(i);
            }
        }
        return null;
    }
}
