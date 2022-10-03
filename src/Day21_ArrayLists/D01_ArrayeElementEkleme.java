package Day21_ArrayLists;

import Day08_SwitchStringManipulations.D12_Substring;
    import Day19_Arrays.D12_ArrayeIstenenBirElemanEkleme;
    import java.util.Arrays;

    public class D01_ArrayeElementEkleme {

        public static void main(String[] args) {

            int[] arr={2,4,5};
            // Bu array'in sonuna 3 elementini ekleyelim
            // arr[3]=3; array'in uzunlugu degistirilemez

            arr= D12_ArrayeIstenenBirElemanEkleme.arrayeElemanEkleme(arr,3);

            System.out.println(Arrays.toString(arr)); // [2, 4, 5, 3]

            // bir de 7 ekleyelim

            arr=D12_ArrayeIstenenBirElemanEkleme.arrayeElemanEkleme(arr,7);

            System.out.println(Arrays.toString(arr));  // [2, 4, 5, 3, 7]
    }
}