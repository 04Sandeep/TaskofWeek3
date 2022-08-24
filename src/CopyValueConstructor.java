public class CopyValueConstructor {
    int id;
    String name;
    CopyValueConstructor(int i, String n)
    {
        id=i;
        name=n;
    }
    CopyValueConstructor()
    {

    }
    void display()
    {
        System.out.println(id+ " " +name);

    }
    public static void main(String[] args)
    {
        CopyValueConstructor cvc = new CopyValueConstructor(111,"Karan");
        CopyValueConstructor cvc1 = new CopyValueConstructor();
        cvc1.id=cvc.id;
        cvc1.name=cvc.name;
        cvc.display();
        cvc1.display();
    }
}
