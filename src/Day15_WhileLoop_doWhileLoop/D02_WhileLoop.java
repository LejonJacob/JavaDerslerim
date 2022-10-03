package Day15_WhileLoop_doWhileLoop;

public class D02_WhileLoop {
    public static void main(String[] args) {


        // iki basamakli sayilardan 7 ile bolunebilenleri
        // while loop ile yanyana yazdirin
        int sayi=10;
        while(sayi<100){
            if (sayi%7==0){
                System.out.print(sayi + " ");
            }
            sayi++;
        }


        /*
          While loop'da da baslangic degeri, bitis sarti ve
          artim miktarini yazmak zorundayiz
          While loop kullanirken, syntax'de hata yaparsak
          yanlis sonuclar elde edebiliriz
          ornegin:
          artim miktari yazilmasi unutulursa sonsuz loop olusur
        */


    }
}