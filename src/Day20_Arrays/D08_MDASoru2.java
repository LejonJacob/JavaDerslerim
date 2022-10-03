package Day20_Arrays;

import java.util.Arrays;

public class D08_MDASoru2 {
    public static void main(String[] args) {

        /*
          Verilen 2 katli bir MDA'de her bir ic array'deki elementleri toplayip
          yeni olusturacagimiz tek katli bir array'in o indexdeki elementi yapip
          yazdirin
        */


        int[][] arr={{3,1,2,4}, {1,2}, {3,4,5}, {10}};

        int[] yeniArray= new int[arr.length];
        System.out.println(Arrays.toString(yeniArray)); // [0, 0 , 0, 0 ]

        int elemanToplami=0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                elemanToplami += arr[i][j];

            }
            yeniArray[i] =elemanToplami;
            elemanToplami=0;

        }

        System.out.println(Arrays.toString(yeniArray)); // [10, 3, 12, 10]

    }
}
