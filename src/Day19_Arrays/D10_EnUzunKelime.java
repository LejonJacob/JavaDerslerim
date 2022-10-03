package Day19_Arrays;

public class D10_EnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String [] arr={"Fatih", "Muhammed", "Jacob", "Dalyan", "Bora", "Esra"};

        String enUzun= arr[0];
        String enKisa= arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].length()>enUzun.length()){
                enUzun=arr[i];

            }
            if (arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            }

        }
        System.out.println("En Uzun Kelime : "+ enUzun+ "\nEn Kisa Kelime : " + enKisa);

        System.out.println();


        System.out.println("******************* Method ile Olusturma ***************************");


        // Method olarak yapalim

        enUzunvenKisayiYazdir(arr);

    }

    public static void enUzunvenKisayiYazdir(String[] arr) {

        String enUzun= arr[0];
        String enKisa= arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].length()>enUzun.length()){
                enUzun=arr[i];

            }
            if (arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            }

        }
        System.out.println("En Uzun Kelime : "+ enUzun+ "\nEn Kisa Kelime : " + enKisa);



    }
}
