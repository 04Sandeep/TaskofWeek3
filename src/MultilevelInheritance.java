public class MultilevelInheritance {
    public static void main(String[] args)
    {
        Chapter s = new Chapter();
        s.study();
        s.sub();
        s.name();
    }
}
       class Student {
           void study() {
               System.out.println("Study");
           }
       }
       class Subject extends Student
       {
           void sub()
           {
               System.out.println("English");
           }

       }
       class Chapter extends Subject
       {
           void name()
           {
               System.out.println("Grammar");
           }
       }