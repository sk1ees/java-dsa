package basics.ClassObj;

public class ComplexNumber {


    public static void main(String[] args){


        class ComplexNum{

            int real ;
            int imaginary;

            ComplexNum(int userReal , int userImaginary ){
                    real = userReal;
                    imaginary = userImaginary;

            }

            ComplexNum add(ComplexNum y){
               real = real + y.real;
               imaginary = imaginary + y.imaginary;
              ComplexNum res = new ComplexNum(real , imaginary);
               return res;


            }

            void print(){
                System.out.println(real + " + " + imaginary+ "i");
            }
        }

        ComplexNum c1 = new ComplexNum(5 ,3);
        ComplexNum c2 = new ComplexNum(3 ,5);

       ComplexNum sumBoth = c1.add(c2);

        sumBoth.print();

    }
}
