package Day45_Maps2;

import Day44_Maps.D02ReusableMethods;

import java.util.Map;
import java.util.Set;

public class D03_EntrySet2 {
    public static void main(String[] args) {

        // 11.siniftaki MF ogrencilerini no,isim,soyisim seklinde yazdirin


        Map<Integer,String> ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();
        System.out.println("No:  Isim:  Soyisim:");

        // Ilk önce Map'deki tüm entry'leri bir set'e store(kaydettik) ettik
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti= ogrenciMap.entrySet();


        for (Map.Entry<Integer,String> each: ogrenciEntrySeti) {

            Integer tempKey= each.getKey();
            String tempValue= each.getValue();
            String[] tempValueArr=tempValue.split("-"); // [Ali, Can, 10, H ,MF]

            if (tempValueArr[2].equals("11") && tempValueArr[4].equalsIgnoreCase("MF") ){

                System.out.println(each.getKey()+"  " +
                        tempValueArr[0]+"   "+
                        tempValueArr[1]);
            }
        }


    }
}