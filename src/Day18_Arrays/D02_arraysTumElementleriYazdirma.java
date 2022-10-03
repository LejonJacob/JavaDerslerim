package Day18_Arrays;

import java.util.Arrays;

public class D02_arraysTumElementleriYazdirma {
    public static void main(String[] args) {

        int [] arr={3, 5 , 7, 10};

        //Array'in tüm elementlerini yazdiralim

        System.out.println(arr[0] + " ");
        System.out.println(arr[1] + " ");
        System.out.println(arr[2] + " ");
        System.out.println(arr[3] + " ");

        System.out.println("");


        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + " ");

        }

        // Eger Arrayleri yazdirmak istersek

        System.out.println(arr); // [I@7f690630 bu yazdirma islemi bize refaransini yazdirir,

        // Ancak; Array'i yazdirabilmek icin Arrays Class'indan hazir method kullanmamiz gerekir.

        System.out.println(Arrays.toString(arr)); // [3, 5 , 7, 10]


    }
}
