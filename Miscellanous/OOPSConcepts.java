package basics.Miscellanous;

public class OOPSConcepts {


    public static void main(String[] args){

        class Car{
            String name = "Motorola";
            String company = "BMW";
            int price = 4655;

            void run(){
                System.out.println("running");
            }
            void play(){
                System.out.println("crashed");
            }
        }

        Car c1 = new Car();
        System.out.println(c1.company);

        c1.play();
        c1.company = "aditya birla";
        System.out.println(c1.company);

    }
}
