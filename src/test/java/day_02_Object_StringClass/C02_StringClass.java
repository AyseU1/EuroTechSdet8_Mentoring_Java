package day_02_Object_StringClass;

public class C02_StringClass {
    public static void main(String[] args) {

        String str1="hello";
        String str2="hello";
        String str3="Hello";

        //    Calculator calc=new Calculator();

        String str4=new String("hello");



        boolean bl;
        bl = str1==str2;
        System.out.println(bl);
        bl=str1.equals(str2);
        System.out.println(bl);

        System.out.println("------------------");

        bl=str1==str3;
        System.out.println(bl);
        bl=str1.equals(str3);
        System.out.println(bl);


        System.out.println("------------------");

        bl=str1==str4;
        System.out.println(bl);
        bl=str1.equals(str4);
        System.out.println(bl);
        bl=str3.equals(str4);
        System.out.println(bl);


    }
}
