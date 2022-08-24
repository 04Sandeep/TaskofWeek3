public class MethodOverriding {
    void run()
    {
        System.out.println("Vehicle is running");
    }
}
class Bike extends MethodOverriding
{
    void run()
    {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] arg)
    {
        MethodOverriding obj = new Bike();
        obj.run();
    }
}

