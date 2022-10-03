package Day20_Arrays;

public class D05_MDAElemntlriYazdirma {
    public static void main(String[] args) {

        // verilen multi imensional bir array'in tum elementlerini yazdiran
        // bir method olusturun

        /*
          Multidimensional bir array'in ic elementlerine ulasmak ve
          onlarla ilgili isleme yapmak istedigimizde
          MDA'in kat sayisi kadar ic icice loop'lar olusturmaliyiz
        */

        int[][] arr= {{1,2,3,4}, {3,4,3}, {2,4}};

        elementleriyazdir(arr);

    }

    public static void elementleriyazdir(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] +" ");

            }

        }

    }
}
