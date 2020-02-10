import java.util.ArrayList;

public class Home {
    ArrayList<Animal> pets = new ArrayList<Animal>();
    public void adoptPet(Animal animal)
    {

        pets.add(animal);

    }
    public  void makeAllSound()
    {
    for(Animal animal : pets) {
        animal.Sound();
    }

    }
}
