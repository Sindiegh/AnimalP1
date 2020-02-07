public class Animal {

    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    protected void sounds()
   {

           System.out.println("Dog barks");

               System.out.println("Cat barks");

   }

   protected void eat()
   {
       System.out.println(name+ "eats");
   }

}

