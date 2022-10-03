package Day19_Arrays;

import java.util.Arrays;

public class D13_ArraySiralama {
    public static void main(String[] args) {

        // Verilen bir String Aarray'i Naturel Order ve Ters Siralama yapip yazdiralim

        String [] arr={"fatih", "Muhammed", "Jacob", "Dalyan", "Bora", "Esra", "Mehmet"};

        /*
            Dikkat: Kücük harfleri ASCII degeri daha büyük oldugundan siralamada önce buyuk harfle baslayanlar,
            sonra kücük harfle baslayanlar gelir
         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        String[] tersSirali= new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            tersSirali[i]=arr[arr.length-i-1];

        }
        System.out.println("Ters Sirali Array : " + Arrays.toString(tersSirali));


    }
}
