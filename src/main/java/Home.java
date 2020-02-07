import java.util.ArrayList;

public class Home
{

    ArrayList<Animal> pets = new ArrayList<Animal>();
    public void adoptPet(Animal pet)
    {
        pets.add(pet);
    }
    public void makeAllSounds(){
        for(Animal a: pets)
        {
            a.sounds();
        }
    }
}
