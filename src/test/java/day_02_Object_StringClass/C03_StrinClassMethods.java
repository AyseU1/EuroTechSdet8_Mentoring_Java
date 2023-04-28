package day_02_Object_StringClass;

public class C03_StrinClassMethods {
    public static void main(String[] args) {

        // length();
        String dil="java"; // String pool içersinde bir obje oluşturdum

        System.out.println(dil.length());

        dil="python"; // String pool içersinde bir obje oluşturdum
        System.out.println("dil.length() = " + dil.length());


        System.out.println("------------");

        //toUpperCase() , toLOwerCase()
        System.out.println("dil.toUpperCase() = " + dil.toUpperCase());
        System.out.println("dil = " + dil);

        dil=dil.toUpperCase();
        System.out.println("dil = " + dil);

        System.out.println("------------");



        // charAt()--- dil = PYTHON
        //                   012345


        System.out.println("dil.charAt(0) = " + dil.charAt(0));
        System.out.println("dil.charAt(5) = " + dil.charAt(5));
     //   System.out.println("dil.charAt(6) = " + dil.charAt(6)); //StringIndexOutOfBoundsException

        System.out.println("dil.charAt(dil.length()-1) = " + dil.charAt(dil.length() - 1));

        System.out.println("------------");


        //concat() dil = PYTHON

        System.out.println("dil.concat(\"programlama dili Java'dan daha kolaydır.\") = "
                + dil.concat(" programlama dili Java'dan daha kolaydır."));

        dil=dil.concat(" programlama dili Java'dan daha kolaydır.");

      //  System.out.println("(dil+\" \") = " + (dil + "5"));
     //   System.out.println("dil.concat(5) = " + dil.concat(5)); HATA VERİR

        System.out.println("------------");


        // contains();

        System.out.println("dil = " + dil);
        System.out.println("dil.contains(\"dili\") = " + dil.contains("dili"));
        System.out.println("dil.contains(\"dili J\") = " + dil.contains("dili J"));
        System.out.println("dil.contains(\"dili J\") = " + dil.contains("diliJ"));
        System.out.println("dil.contains(\"pyhton\") = " + dil.contains("pyhton"));

        System.out.println("------------");

        // trim()

        String s="   Hello   World    ";
        System.out.println("s = " + s);
        System.out.println("s.trim() =" + s.trim());

        System.out.println("s = " + s);
        String trimedS=s.trim();
        System.out.println("trimedS = " + trimedS);


        System.out.println("------------");


        // indexOf()
        System.out.println("trimedS = " + trimedS);
        System.out.println("trimedS.indexOf(\"H\") = " + trimedS.indexOf("H"));
        System.out.println("trimedS.indexOf(\"Hell\") = " + trimedS.indexOf("Hell"));
        System.out.println("trimedS.indexOf(\"World\") = " + trimedS.indexOf("World"));

    }
}
