public class Overriding {
        void start()
        {
            System.out.println("Vehicle starts");
        }
        void stop()
        {
            System.out.println("Vehicle stops");
        }

}
    class Vehicles extends Overriding
    {
        void start() {
            System.out.println("Vehicle starts");
        }

        void stop() {
            System.out.println("Vehicle stops");
        }
    }
        class TestOverriding1 {
            public static void main(String[] arg)
            {
                //OverrdiingExample obj = new OverrdiingExample();
                Overriding obj = new Vehicles();
                obj.stop();
            }
        }






