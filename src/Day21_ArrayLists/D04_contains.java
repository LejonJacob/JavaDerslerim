package Day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class D04_contains {
    public static void main(String[] args) {

        /*
          contains method'u bir listede aradigimiz elementin var olup olmadigini
          boolean sonuc olarak dondurur
        */

        int[] arr={2,3,4,5,3,6,7,3,8,9,1,2,5,3,8,5};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar.contains(4)); // true

    }
}