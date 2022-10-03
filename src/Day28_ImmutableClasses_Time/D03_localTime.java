package Day28_ImmutableClasses_Time;

import java.time.LocalDate;

public class D03_localTime {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();
        System.out.println(trh);

        System.out.println(trh.getDayOfWeek());

        System.out.println(trh.getDayOfMonth());

        System.out.println(trh.getDayOfYear());

        System.out.println(trh.getMonth());

        System.out.println(trh.getMonthValue());

        System.out.println(trh.plusYears(3).plusMonths(2).plusDays(10));


        System.out.println(trh.minusWeeks(3).minusDays(3));


        LocalDate dogTar1=LocalDate.of(2011, 10, 12);
        LocalDate dogTar2=LocalDate.of(2011, 10,14);

        if (dogTar1.isBefore(dogTar2)){
            System.out.println("1. Kisi daha yasli");
        } else if (dogTar1.isAfter(dogTar2)) {
            System.out.println("2. kisi daha yasli");
        } else {
            System.out.println("iki kisi de ayni gün dogmustur");
        }

        System.out.println(dogTar1.isLeapYear()); // False

        System.out.println(trh.lengthOfYear()); // 365

        System.out.println(trh.withDayOfMonth(20)); // 2022-09-20
    }
}
