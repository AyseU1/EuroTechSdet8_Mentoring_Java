package day_01_Methods;

public class C07_Task1 {
    public static void main(String[] args) {
        //  1. create a method that can print odd numbers
        //  between 1~100 in a same line saperated by space
   // oddNumbers();
      //  System.out.println(oddNumbersWithReturn());

        int a = 5; for (int i = 2; i <= 3; i++) { for (int j = 1; j <= 3; j++) { a += (i * j); } } System.out.println( a);


        System.out.println("\"ççl\" = " + "ççl");

    }

    public static void oddNumbers(){
        for (int i = 1; i < 100; i+=2) {
            System.out.print(i+" ");
        }

    }

    public static String oddNumbersWithReturn(){
        String result="";
        for (int i = 1; i < 100; i+=2) {
            result+=i+" ";
        }

        return result;
    }




}
