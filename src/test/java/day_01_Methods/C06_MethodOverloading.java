package day_01_Methods;

public class C06_MethodOverloading {
    public static void main(String[] args) {
        /*
         * 3 parametreli bir method yazin int ve String ve boolean tipinde 3 parametre alsin
         * Boolean true ise int ve String değeri concat yapsın.
         * false ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.*/

        mthd(10,"Ahmet", false);



    }




                        //    10      Ahmet     true
    public static void mthd(int i, String str, boolean b){
        // true
        if (b){
                             // 10      Ahmet
            System.out.println((i +" "+ str));
        }else {
            mthd(i,str);
        }
    }

                    //        10        Ahmet
    public static void mthd(int num, String str){
        for (int i = 1; i <= num; i++) {
            System.out.println(str);
        }

    }



    }




