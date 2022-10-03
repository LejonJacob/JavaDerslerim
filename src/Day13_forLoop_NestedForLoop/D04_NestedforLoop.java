package Day13_forLoop_NestedForLoop;

public class D04_NestedforLoop {
    public static void main(String[] args) {

        /*
         icice (nested) iki loop varsa
         outer loop her deger alddiginda
         inner loop bastan sona bir kez calisir
         */


        for (int i = 1; i <=5 ; i++) {  // dis loop , outer loop
            for (int j = 1; j <=5; j++) { // ic loop , inner loop
                System.out.print(i*j + "  ");

            }
            System.out.println("");
        }
    }
}
