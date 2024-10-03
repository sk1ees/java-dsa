package basics.Algorithms.LinearSearch;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(checkLength(453453));
    }

    static int checkLength(int num){
        return (int)(Math.log10(num))+1;
    }
}
