package basics.Miscellanous;

public class forEachLoop {

    public static void main(String[] args){

//            int[] arr = {1,2,3,4,5};
//
//
//            for(int num: arr){
//                System.out.println(num);
//            }



            int[] arr = {1,2,3,4,5};
            int key = 2;
            boolean found = false;
            for(int num: arr){
                if(num == key){
                        found = true;
                        break;
                }
            }

        if(found){
            System.out.println("found");

        }else{
            System.out.println("not found");
        }

    }
}
