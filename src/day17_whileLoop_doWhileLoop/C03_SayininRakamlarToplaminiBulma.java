package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz..");
        int girilenSayi = scanner.nextInt();
        String strNumber= Integer.toString(girilenSayi);
        int strLen=strNumber.length();
        int i=0;
        int a;
        int sum=0;
        while (i < strLen) {

            a=Integer.parseInt(Character.toString(strNumber.charAt(i)));
            sum+=a;
            i++;
        }
        System.out.println(Math.pow(2, 5));
        System.out.println("Toplam="+sum);


        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int dummyNumber = girilenSayi;

        while (  dummyNumber != 0   ){

            birlerBasamagi = dummyNumber % 10;
            rakamlarToplami += birlerBasamagi;
            dummyNumber /= 10;

        }

        System.out.println("Girdiginiz " + girilenSayi +" sayisinin rakamlar toplami : " + rakamlarToplami);


    }
}
