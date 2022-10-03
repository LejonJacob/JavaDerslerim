package Day19_Arrays;

import java.util.Arrays;

public class D08_ElemanlariKaydirma {
    public static void main(String[] args) {


        int[] arr={4, 5, 6, 7, 9};

        int temp=arr[arr.length-1];

        for (int i =arr.length-1 ; i >0 ; i--) {

            arr[i]=arr[i-1];

        }

        arr[0]=temp;

        System.out.println(Arrays.toString(arr));


        // Method ile yapalim

        arr=sagaKaydir(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] sagaKaydir(int[] arr) {

        // sondaki elementi gecici depoya koyduk
        int temp=arr[arr.length-1];

        // elementleri bir sagdakine atayip, kaydirdik
        for (int i = arr.length-1 ; i >0 ; i--) {
            arr[i]=arr[i-1];
        }

        // gecici depodaki son elementi ilk elemente atadik
        arr[0]=temp;
        return arr;
    }
}
