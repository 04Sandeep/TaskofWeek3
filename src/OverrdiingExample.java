public class OverrdiingExample {
        void start()
        {
            System.out.println("Vehicle starts");
        }
        void stop()
         {
             System.out.println("Vehicle stops");
          }
}
    class Vehicle extends OverrdiingExample
    {
        void start()
        {
            System.out.println("Vehicle starts");
        }
        void run()
        {
            System.out.println("Vehicle uis running");
        }
        void stop()
        {
            System.out.println("Vehicle stops");
        }
    }
     class TestOverriding
     {
            public static void main(String[] arg) {
                //OverrdiingExample obj = new OverrdiingExample();
               OverrdiingExample obj = new Vehicle();
                obj.stop();
              //  obj.run();
                obj.start();
            }
     }









