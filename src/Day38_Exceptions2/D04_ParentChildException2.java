package Day38_Exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class D04_ParentChildException2 {
    public static void main(String[] args) {


        /*
           eger parent ve child exception'lari try catch ile handle etmek isterseniz
           once child exception'i
           sonra parent exception'i yazmalisiniz
           diger turlu child exception'a erisme ihtimali olmaz
           Java CTE verir
         */
        String path= "src/Day37_Exceptions/TextFile";
        try {
            FileInputStream fis= new FileInputStream(path);
            int k=0;

            while ((k= fis.read()) != -1){
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
