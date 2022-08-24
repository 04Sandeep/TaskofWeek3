public class ParameterizedConstructor {
    int id;
    String name;
    ParameterizedConstructor(int i, String n)
    {
        this.id=i;
        this.name=n;
    }
    void display()
    {
        System.out.println(id+ " " +name);
    }
    public static void main(String args[])
    {
        ParameterizedConstructor pc = new ParameterizedConstructor(111,"Karan");
        pc.display();
    }
}