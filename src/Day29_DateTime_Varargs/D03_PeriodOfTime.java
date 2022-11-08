package Day29_DateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class D03_PeriodOfTime {
    public static void main(String[] args) {

        // Dogum tarihinizi ve bugunu local date olarak olusturup
        // Kac yasinda oldugunuzu yazdirin

        LocalDate bugun=LocalDate.now();
        LocalDate dogumTarihi=LocalDate.of(1972,01,01);


        Period yas=Period.between(dogumTarihi,bugun);
        System.out.println(yas); // P50Y8M
        System.out.println(yas.getYears()); // 50

    }
}
