package basics.ClassObj;

public class ClassCar {
    public static void main(String[] args){



       class Car{
           String model = "BMW";
           String color = "white";
           int price = 564;
           boolean isLocked = false;

           void lock(){
               isLocked = true;
               System.out.println("car is locked!");
           }

           void unlock(){
               isLocked = false;
               System.out.println("car is unlocked!");
           }


           int getPrice(){
               return price;
           }

           void setPrice(int userPrice){
               price = userPrice;

           }
       }

       Car c1 = new Car();

        System.out.println(c1.getPrice());
    c1.setPrice(12);

        System.out.println(c1.price);


c1.lock();
c1.unlock();
        System.out.println(c1.isLocked);


    }
}
