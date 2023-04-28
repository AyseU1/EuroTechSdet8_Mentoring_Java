package day_01_Methods;

public class C04_CostumMethodsPractice {
    public static void main(String[] args) {

        System.out.println(oddOrEven(15));

    }


//    //     a function that can check if a number is odd number or even number
//    /**
//    * a function that can check if a number is odd number or even number
//    *
//    * @param number
//    */

//    public static void oddOrEven(int number){
//        if(number%2==0){
//            System.out.println(number+" is an even number");
//        }else
//            System.out.println(number+" is an odd number");
//    }


    public static String oddOrEven(int num){
        String result="";
        if(num%2==0){
            result="even number";
        }else
            result="odd number";
        return result;

    }



}
