package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06_ListMethodlari {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma"));

        System.out.println(isimler); // [Ali, Veli, Ayse, Fatma]

        isimler.add(0, "Mehmet");

        System.out.println(isimler); // [Mehmet, Ali, Veli, Ayse, Fatma]

        isimler.add(2, "Gul");

        System.out.println(isimler); // [Mehmet, Ali, Gul, Veli, Ayse, Fatma]


        isimler.set(2, "Ahmet");

        System.out.println(isimler); // [Mehmet, Ali, Ahmet, Veli, Ayse, Fatma]

        isimler.set(isimler.size() - 1, "Kemal");

        System.out.println(isimler); // [Mehmet, Ali, Ahmet, Veli, Ayse, Kemal]

        List<Integer> myList = new ArrayList<>();

        myList.add(3);
        myList.add(3);  myList.add(34);
        myList.add(3);

        myList.add(1);
        myList.add(5);
        myList.add(6);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(3);

        // myList.set(1,2)

        //myList.remove(2);
        C06_ListMethodlari obj = new C06_ListMethodlari();
        System.out.println(obj.getList(myList, 100));
        System.out.println(obj.changeList(myList));



    }


    List<Integer> getList(List<Integer> a, int incr) {

        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i) + incr);

        }
        return a;

    }

    List<Integer> changeList(List<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            int dummy = a.get(i);
            for (int j = i + 1; j < a.size(); j++) {

                if (dummy == a.get(j)) {
                    a.remove(j);


                    j--;
                    i--;

                    if(i<0) i=0;
                    if(j<0) j=0;
                }

            }
        }
        Collections.sort(a);
        return a;

    }
}
