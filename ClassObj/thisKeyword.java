package basics.ClassObj;

public class thisKeyword {

    public static void main(String[] args){


        class ComplexNumber{
            int real;
            int imaginary;

            ComplexNumber(int real , int imaginary){
                this.real = real;
                this.imaginary = imaginary;
            }

            public String toString(){
                return this.real + " + " + this.imaginary;
            }
        }


        ComplexNumber c1 = new ComplexNumber(3,5);
        System.out.println(c1);
    }
}
