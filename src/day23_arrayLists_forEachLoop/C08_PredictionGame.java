package day23_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C08_PredictionGame {
    public static void main(String[] args) {

        List<Integer> myList=new ArrayList<>();

        Scanner scan= new Scanner(System.in);

        int a;
        do{
            System.out.println("Lütfen tahminlerinizi giriniz.\nÇıkış için negatif bir sayı giriniz: ");
            a=scan.nextInt();

            if(a>=0) myList.add(a);
        }
        while(a>=0);

        Random rand=new Random();
        int mynumber=rand.nextInt(10000);

        int fark=-1;
        int smallestdiff=-1;
        int enyakinsayi=-1;

        for (int item:myList) {
            fark=Math.abs(item-mynumber);
            if (smallestdiff==-1) {

                smallestdiff=fark;
                enyakinsayi=item;

            }
            else if (smallestdiff>fark) {
                smallestdiff=fark;
                enyakinsayi=item;

            }
//            else {}
        }

        System.out.println("Sayilar:"+ myList);
        System.out.println("Seçilen sayı: "+mynumber);
        System.out.println("En yakın sayı:"+ enyakinsayi);

        System.out.println(mynumber+5);
        }
    }

