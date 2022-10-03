package Day19_Arrays;

import java.util.Arrays;

public class D12_ArrayeIstenenBirElemanEkleme {
    public static void main(String[] args) {

        /*
           Soru 7- Verilen bir array’e istenen bir elemani ekleyip
           bize donduren bir method yazin, eski array’e yeni degeri atayin.
        */

        int[] arr={ 3, 6, 8, };

        int eklenecekDeger=10;

        arr=arrayeElemanEkleme(arr, eklenecekDeger);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayeElemanEkleme(int[] arr, int eklenecekDeger) {

        int[] yeniArr= new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i]=arr[i];

        }

        yeniArr[yeniArr.length-1]=eklenecekDeger;
        return yeniArr;
    }
}
