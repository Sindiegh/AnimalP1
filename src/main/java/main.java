public class main {
    public static void main(String [] args )
    {
        // Java

        Dog dog = new Dog();

        dog.eat()   ; // -> 'Rax eats'
        dog.sounds() ;// -> 'Dog barks'

                Cat cat = new Cat();

        cat.eat()   ; // -> 'Stormy eats'
        cat.sounds() ;// -> 'Cat meows'


        Home[] homeArray = new Home[]{};


        Home home = new Home();
                Dog dog1 = new Dog();
                Dog dog2 = new Dog();
        //Cat cat = new Cat();

        home.makeAllSounds(); // this doesn't do anything
        home.adoptPet(dog1);
        home.makeAllSounds();
// this prints:
// Dog barks

        home.adoptPet(cat);
        home.makeAllSounds();
// this prints:
// Dog barks
// Cat meows

        home.adoptPet(dog2);
        home.makeAllSounds();
// this prints:
// Dog barks
// Cat meows
// Dog barks


    }


}
