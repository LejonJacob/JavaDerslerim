package Day45_Maps2;

import Day44_Maps.D02ReusableMethods;

import java.util.Map;
import java.util.Set;

public class D07_EntrySetUpdate3 {
    public static void main(String[] args) {

        // Soyisimleri büyük harfe cevirelim

        Map<Integer,String> ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti= ogrenciMap.entrySet();

        String tempValue;
        String[] tempValueArr;

        for (Map.Entry<Integer,String> each: ogrenciEntrySeti) {

            tempValue= each.getValue();
            tempValueArr=tempValue.split("-"); // [Ali, Can, 10, H ,MF]
            tempValueArr[1]=tempValueArr[1].toUpperCase(); // [Ali, CAN, 10, H ,MF]

            tempValue=tempValueArr[0] +"-"+
                    tempValueArr[1] +"-"+
                    tempValueArr[2] +"-"+
                    tempValueArr[3] +"-"+
                    tempValueArr[4]; // Ali-CAN-10-H-MF

            each.setValue(tempValue);
        }
        System.out.println(ogrenciMap);

    }
}
