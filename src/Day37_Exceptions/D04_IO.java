package Day37_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class D04_IO {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java bilgisayirimizdaki dosyalarla etkilesime gecebilir
        bunun icin Java utill de FileInputStream ve FileOutputStream classlari olusturulmustur.
        biz bir dosyayi okumak icin o dosyaya erismek istdigimizde FileInputstream
        dosyayi degistirmek icin erismek istedigimizde FileOutputStream kullaniriz
        Bir dosyayi kodlarimiza dahil etmek istedigimizde
        Java'ya o dosyayi bulacagi dosya yolunu vermemiz gerekir
        dosya yolu mac ve windows icin farkli olabilir
        windows'da sonunda dosya eklentisi olmak zorundadir
        IO (input Output) islemleri yapmak istedigimizde
        Java dosyaya ulasamama, dosyayi okuyamama veya farkli sorunlar olusabilecegini ongorur
        ve bastan bize cozum uretmemizi ister
        Ya try catch ile sarmalariz
        veya method signature'una ekleyecegimiz bir keyword ile
        calismaya devam etmesini soyleyebiliriz
         */

        String path="src/Day37_Exceptions/TextFile";
        FileInputStream fis = new FileInputStream(path);


    }
}
