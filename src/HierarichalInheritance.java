public class HierarichalInheritance {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
       // c.sleep();
    }
}
      class Dog
      {
    void eat()
    {
        System.out.println("eating...");
    }
    }
     class Rat extends Dog
     {
    void sleep()
    {
        System.out.println("sleeping...");
    }
    }
    class Cat extends Dog
     {
    void meow()
    {
        System.out.println("meowing...");
    }
    }


