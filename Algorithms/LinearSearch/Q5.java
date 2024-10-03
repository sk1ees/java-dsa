package basics.Algorithms.LinearSearch;
//FIND THE EVEN LENGTH NUMBERS IN AN ARRAY
public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1,2 ,2 ,3 ,4567};
        System.out.println(searchEven(arr));
    }

    static int searchEven(int[] arr){
        int count = 0;
        for(int num :arr){

           int result =  countLength(num);
            if(result%2==0){
                count++;
            }
        }
        return count;
    }
static int countLength(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
}

}
