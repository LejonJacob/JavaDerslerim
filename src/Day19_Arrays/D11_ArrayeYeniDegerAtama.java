package Day19_Arrays;

import java.util.Arrays;

public class D11_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        /*
             KURAL : Bir array'in uzunlugu sabittir ve degistirilemez
             ancak ihtiyac duydugumuzda yeni bir array olusturup
             o array'i eski array'e atayabiliriz
        */

        int [] arr={2, 3, 5};

        // arr={2, 3, 5} yapamayiz, cünkü arrayin uzunlugunu degistiremeyiz,
        // ancak ilk array degerine yeni bir atama yaparsak elementlerini ve uzunlugunu da degistirebiliriz.

        int[] yeniDeger={4, 5, 6, 8};

        arr=yeniDeger;

        System.out.println(Arrays.toString(arr)); // [4, 5, 6, 8 ]


        // Örnegin arr = [1,2,3] array'ini [1,2,3,4] haline getirmek istersek
        int[] arr1={1, 2, 3};

        int[] yeniarr1=new int[3+1]; // uzunlugu 1 fazla yeni bir array olustururum

        for (int i = 0; i < arr1.length ; i++) {
            yeniarr1[i]=arr1[i];
        }
        yeniarr1[3]=4;
        System.out.println(Arrays.toString(yeniarr1));


    }
}
