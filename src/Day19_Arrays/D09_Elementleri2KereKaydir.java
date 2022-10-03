package Day19_Arrays;

import java.util.Arrays;

public class D09_Elementleri2KereKaydir {
    public static void main(String[] args) {

        /*
         8. sorudaki saga kaydirma islemini 2 kere yapalim
         */

        int[] arr={5,7,9};

        arr=D08_ElemanlariKaydirma.sagaKaydir(arr);

        arr=D08_ElemanlariKaydirma.sagaKaydir(arr);

        System.out.println(Arrays.toString(arr));


    }
}
