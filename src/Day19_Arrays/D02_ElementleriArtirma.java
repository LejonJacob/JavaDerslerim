package Day19_Arrays;

import java.util.Arrays;

public class D02_ElementleriArtirma {
    public static void main(String[] args) {

        //  Soru 1- Verilen bir int array'in tum elemanlarini
        //  istenen bir deger kadar artirip
        //  bize donduren bir method olusturun.
        //  Eski array'i yeni haliyle kaydedin.

        int[] arr={2, 4, 6, 8};
        int artisMiktari= 3;

        /*
        int [] yeniArray= elementleriArtirir(arr , artisMiktari);

        System.out.println("Yeni Array : " + Arrays.toString(yeniArray));

        arr=yeniArray;

        System.out.println("Eski Array : " + Arrays.toString(yeniArray));
        */

        arr=elementleriArtirir(arr, artisMiktari);
        System.out.println("Eski Array : "+ Arrays.toString(arr));

    }

    static int[] elementleriArtirir(int[] arr, int artisMiktari) {

        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=artisMiktari;
        }
        return arr;
    }
}
