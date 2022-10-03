package Day29_DateTime_Varargs;

import java.time.LocalTime;
import java.time.ZoneId;

public class D01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        LocalTime localSaat=LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(localSaat);

        LocalTime localSaat2=LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(localSaat2);

        LocalTime localSaat3=LocalTime.now(ZoneId.of("America/Montevideo"));
        System.out.println(localSaat3);

        LocalTime localSaat4=LocalTime.now(ZoneId.of("Japan"));
        System.out.println(localSaat4);

        LocalTime localSaat5=LocalTime.now(ZoneId.of("Pacific/Auckland"));
        System.out.println(localSaat5);

    }
}
