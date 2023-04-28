package day_02_Object_StringClass;

public class C04_StringMethodsCont {
    public static void main(String[] args) {

        //StringEqualsIgnoreCase
        String s1="Merhaba";
        String s2="MERhaBa";
        System.out.println("(s1==s2) = " + (s1 == s2));

        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));


        // isEmpty() // isBlank

        System.out.println("s1.isEmpty() = " + s1.isEmpty());

        s2="";
        System.out.println("s2.isEmpty() = " + s2.isEmpty());

        String s3=" ";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());


        // startsWith() , endsWith()
        String str1= "Java is cool";
        System.out.println("str1.startsWith(\"J\") = " + str1.startsWith("J"));
        System.out.println("str1.startsWith(\"J\") = " + str1.startsWith("Java"));
        System.out.println("str1.startsWith(str1) = " + str1.startsWith(str1));
        System.out.println("str1.startsWith(\" \") = " + str1.startsWith(" "));
        System.out.println("str1.startsWith(\"\") = " + str1.startsWith(""));

        System.out.println("-----------");


        System.out.println("str1.endsWith(\"cool\") = " + str1.endsWith("l"));


        // substring

        String str2="Java Programming Language";


        //     J  a   v   a
        //     0  1   2   3   index numaralrı
        //     1  2   3   4    length

        // tek parametrelide başlangıç indexini dhil ediyor
        System.out.println(str2.substring(5));
        System.out.println(str2.substring(0));
        System.out.println(str2.substring(17));
  //      System.out.println(str2.substring(str2.length()));// empty
        System.out.println(str2.substring(str2.length() - 3));


        // çift parametreli
        // başlangıç indexini alır endIndex i almaz


        //String str2="Java Programming Language";
        //


        System.out.println("str2.substring(0,1) = " + str2.substring(0, 1));
        System.out.println("str2.substring(5,16) = " + str2.substring(5, 16));
        System.out.println("str2.substring(5,5) =" + str2.substring(5, 5));//""
        System.out.println("str2.substring(4,5) =" + str2.substring(4, 5));//" "
     //   System.out.println("str2.substring(5,3) = " + str2.substring(5, 3));
                                // RunTime Error; StringIndexOutOfBoundsException


        System.out.println("\"-------\" = " + "-------");

        String str="Merhaba";
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));

        // lastIndexOf()

        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));


        System.out.println("\"-------\" = " + "-------");

        // replace()

        int len=str.length();//String str="Merhaba";   7
        System.out.println("len = " + len);// 7
        str=str.replace("a","");//"Merhb";
        int lenFinal=str.length(); //5
        System.out.println("Merhaba da a  " + (len - lenFinal)+" adettir.");
    }
}
