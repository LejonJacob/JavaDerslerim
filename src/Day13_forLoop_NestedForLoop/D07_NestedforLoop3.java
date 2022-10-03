package Day13_forLoop_NestedForLoop;

public class D07_NestedforLoop3 {
    public static void main(String[] args) {




        /*
             Asagidaki sekli yazdiran bir program yaziniz
             kac satir oldugu ve stirda kac yildiz olacagi input olarak veriliyor
             *
             * *
             * * *
             * * * *
        */

        int satir=8;
        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}