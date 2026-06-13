package day15_methodOlusturmaVeKullanma;

public class C04_MethodOlusturma_KucukOlmayaniYazdir {

    public static void main(String[] args) {

        // verilen iki tamsayidan kucuk olmayani yazdirin


        kucukOlmayaniYazdir(7,9); // 9
        kucukOlmayaniYazdir(10,10); // 10
        // kucukOlmayaniYazdir(5);
        // kucukOlmayaniYazdir(5,6,7);

        C03_MethodOlusturma_AsalMi ob = new C03_MethodOlusturma_AsalMi();
        ob.isPrime(2);

    }


    public static int kucukOlmayaniYazdir(int sayi1 , int sayi2){

        System.out.println( sayi1<sayi2 ? sayi2 : sayi1); // 44
        int sayi= sayi1<sayi2?sayi2:sayi1;
        return sayi;

    }


}
