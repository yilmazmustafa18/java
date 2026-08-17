package day38_interfaces;

public interface I01_Interface {

    int sayi=0;
    /*
        biz interface icinde abstract yazmadan bir method olustursak da
        Java body eklememize izin vermiyor ve
        Interface abstract methods cannot have body
     */

    // public void method1(){

    // }


        /*
        biz interface icinde bir method olusturdugumuzda
        public ve abstract keywor'lerini
        YAZSAK da , YAZMASAK da farketmez
        Java tum methodlari public ve abstract olarak kabul eder
        asagidaki method'larin hepsi public ve abstract'tir
     */

    public abstract void method2();

    public default void measureTemp(){
        System.out.println("measureTemp");
    }

    public static void measureHeat(){
        System.out.println("static measureHeat");
    }

}
