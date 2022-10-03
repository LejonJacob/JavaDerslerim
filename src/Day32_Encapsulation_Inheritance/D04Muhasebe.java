package Day32_Encapsulation_Inheritance;

public class D04Muhasebe extends D03IK {

        /*
        Muhasebe'de de personelin kisisel bilgilerine ihtiyac vardir.
        Bu bilgilere ulasmak icin 2 ihtimal var
        1- IK class'indan obje olusturabiliriz.
        2- Daha kolayi ve sagliklisi
           Muhasebe class'indan IK class'ini inherit ederiz
           yani parent ediniriz
         */


        protected String sgkNo="Deger atanmamis";
        protected boolean raporluMu;

        protected int minSaatUcreti=12;


    protected int standartMaas(){
        return 30*8*minSaatUcreti;
    }

        protected int fazlaMesai(int fazlaMesaiSuresi){
            return fazlaMesaiSuresi*minSaatUcreti*2;
        }

}