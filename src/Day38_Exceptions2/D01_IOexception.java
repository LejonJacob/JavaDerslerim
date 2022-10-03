package Day38_Exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class D01_IOexception {
    public static void main(String[] args) throws FileNotFoundException {

        /*
          Method signature'ina ekledigimiz
          throws FileNotFoundException
          sadece bilgi vermek icindir
          try-catch'deki gibi exception'i handle etmez

          Sadece Java'ya sorumluluk bizde
          sen calismana bak
          exception ile karsilasirsan exception firlat demektir.
         */


        String path= "src/Day37_Exceptions/TextFile";
        FileInputStream fis =new FileInputStream(path);

    }
}

