public class ExampleInheritance
{
    public static void main(String args[])
    {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
    class Animals
    {
       void eat()
       {
        System.out.println("Dog is eating");
       }
    }
     class Dogs extends Animals
      {
          void bark()
          {
          System.out.println("barking...");
          }
      }
      class BabyDog extends Dogs
      {
          void weep()
          {
              System.out.println("weeping...");
          }
      }




