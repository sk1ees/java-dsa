package basics.homeworks;

public class checkAscending {
    public static void main(String[] args){
        int[]arr = {1,4,3,4,5};

    boolean count = false;
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i]<arr[i+1]){
                count = true;


            }else{
                count=false;
               
                break;
            }
        }

        if(count){
            System.out.println("ascending");
        }else{
            System.out.println("not ascending");
        }

    }
}
