package Day19_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class D07_ArrayinIlkNElementiniToplama {
    public static void main(String[] args) {
        // Verilen bir Array'inistenen ilk n elementini toplayip yazdirin

        int[] arr= {2, 4, 5, 7, 1, 7, 4, 7, 3, 9};
        int ilkkacElement=4;
        int toplam=0;

        for (int i = 0; i < ilkkacElement; i++) {
            toplam +=arr[i];

        }
        System.out.println(toplam);

        // Ilk n elementi istedigimiz sayi kadar arttiralim.

        int artisMiktari=2;

        for (int i = 0; i < ilkkacElement; i++) {

            arr[i] += artisMiktari;

        }
        System.out.println(Arrays.toString(arr));

    }
}
