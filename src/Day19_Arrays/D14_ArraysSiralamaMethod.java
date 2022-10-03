package Day19_Arrays;

import java.util.Arrays;

public class D14_ArraysSiralamaMethod {
    public static void main(String[] args) {



        String [] arr={"fatih", "Muhammed", "Jacob", "Dalyan", "Bora", "Esra", "Mehmet"};

        arr= naturalSiralama(arr);
        System.out.println(Arrays.toString(arr));


        arr= tersNaturalSiralama(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static String[] tersNaturalSiralama(String[] arr) {

        Arrays.sort(arr);

        String[] tersSirali=new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            tersSirali[i]=arr[arr.length-i-1];

        }
        return tersSirali;

    }

    public static String[] naturalSiralama(String[] arr) {

        Arrays.sort(arr);
        return arr;

    }

}
