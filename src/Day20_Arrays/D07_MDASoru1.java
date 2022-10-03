package Day20_Arrays;

import java.util.Arrays;

public class D07_MDASoru1 {
    public static void main(String[] args) {

        /*
         Asagida verilen MDA'de ic arraylerde ayni endexe sahip elementleri toplayip
         yeni olusturacagimiz tek katli bir arraye koyup yazdirin
        */

        int[][] arr= {{3,4,5}, {2,3,6,7}};

        int uzunluk=arr[0].length>arr[1].length ? arr[1].length : arr[0].length;

        int [] toplamlarArrayi= new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            toplamlarArrayi[i]=arr[0][i]+arr[1][i];

        }
        System.out.println(Arrays.toString(toplamlarArrayi));



    }
}
