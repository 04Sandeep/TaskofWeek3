public class SingleInheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.bark();
    }

}
    class DogInherit
    {
    public void eat()
    {
        System.out.println(" eating");
    }
    }
    class Animal extends DogInherit {
    public void bark()
    {
        System.out.println(" barking");
    }
    }

