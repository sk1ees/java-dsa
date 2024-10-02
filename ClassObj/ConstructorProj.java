package basics.ClassObj;

public class ConstructorProj {

    public static void main(String[] args){


        class Car{
            String model;
            String color;
            int price;

            Car(){
                model = "default";
                color  = "default";
                price = 0;
                System.out.println("in the default constructor");
            }

            Car(String userModel , String userColor , int userPrice){
                    model = userModel;
                    color = userColor;
                    price = userPrice;
                System.out.println("in the parameterized constructor");
            }
        }

        Car c1 = new Car();
        Car c2 = new Car("bmv" , "black" , 3423);


        System.out.println(c2.price);

    }
}
