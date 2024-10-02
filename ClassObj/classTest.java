package basics.ClassObj;

public class classTest {

public static void main(String[] args){
    class ComplexNumber {
        float real;
        float imaginary;

        // Define constructor here

        ComplexNumber(float real , float imaginary){
            this.real = real;
            this.imaginary = imaginary;
        }

        public String toString(){
            return this.real + " + " + this.imaginary;
        }

        ComplexNumber add(ComplexNumber x){
            // Complete the function
            real = this.real + x.real;
            imaginary = this.imaginary + x.imaginary;

            ComplexNumber sum = new ComplexNumber(real , imaginary);

            return sum;
        }

        ComplexNumber subtract(ComplexNumber x){
            // Complete the function
            real = this.real - x.real;
            imaginary = this.imaginary - x.imaginary;

            ComplexNumber sub = new ComplexNumber(real , imaginary);
            return sub;
        }

        ComplexNumber multiply(ComplexNumber x){
            // Complete the function
            real = this.real * x.real;
            imaginary = this.imaginary * x.imaginary;

            ComplexNumber mul = new ComplexNumber(real , imaginary);
            return mul;
        }

        ComplexNumber divide(ComplexNumber x){
            // Complete the function
            real = this.real / x.real;
            imaginary = this.imaginary / x.imaginary;

            ComplexNumber div = new ComplexNumber(real , imaginary);
            return div;
        }
    }
//    ComplexNumber a = new ComplexNumber(10, 5);
//    ComplexNumber b = new ComplexNumber(2, 3);
//    ComplexNumber c1 = a.add(b) ;
//
//    ComplexNumber c2 = a.subtract(b);
//    ComplexNumber c3 = a.multiply(b);
//    ComplexNumber c4 = a.divide(b);
};

}


