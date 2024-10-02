package basics.Functions;

public class VariableAverage {

static float average(float... varargs){
    float sum = 0;
    for(float nums: varargs){
        sum+=nums;
    }
    return sum/varargs.length;


};
    public static void main(String[] args){


        float avg1 = average(2,5,6,1,8,9);
        float avg2 = average(1,2,3);

        System.out.println(avg1);
        System.out.println(avg2);

    }


}
