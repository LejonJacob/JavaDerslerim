package Day19_Arrays;

public class D06_ElemanlariToplaMain {
    public static void main(String[] args) {

        // Verilen bir arraydaki pozitif  tam sayilari toplayip yazdirin

        int[] arr={3, 5, 7, 10, -5, 0};

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>0) {
                toplam += arr[i];

            }
        }
            System.out.println("Arrayin Pozitif Elementlerinin toplami :" + toplam);

    }
}
