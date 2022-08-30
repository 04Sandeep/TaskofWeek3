public class OverloadingExample {

         public void show(int a, int b)
         {
             System.out.println("the value of a and b is" + a + " " + b);
             }
             public void show(String a, int b, int c)
             {
                 System.out.println("the value of a and b and c is" +a +" " +b +" " +c);
        }

        public static void main(String[] args)
        {
            OverloadingExample oe = new OverloadingExample();
            oe.show(1,2);
            oe.show("a",4, 3);
        }
    }


