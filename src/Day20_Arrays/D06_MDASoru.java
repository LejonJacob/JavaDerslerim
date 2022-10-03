package Day20_Arrays;

public class D06_MDASoru {
    public static void main(String[] args) {

        int[][] arr= {{1,2,3,4}, {3,4,3}, {2,4}};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2==0){
                    toplam +=arr[i][j];

                }
            }
        }

        System.out.println("Arraydaki Cift sayilarin toplami : " + toplam);


    }
}
