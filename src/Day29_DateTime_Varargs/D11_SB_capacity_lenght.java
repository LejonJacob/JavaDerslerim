package Day29_DateTime_Varargs;

public class D11_SB_capacity_lenght {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder(7);
        System.out.println(sb1.capacity()); // 7
        System.out.println(sb1.length()); // 0

        sb1.append("Ali Can");
        System.out.println(sb1.capacity()); // 7
        System.out.println(sb1.length()); // 7

        sb1.append("Bilmeyen var mi ? ");
        System.out.println(sb1.capacity()); // 25
        System.out.println(sb1.length()); // 25

        sb1.append("Inanmayan beri gelsin.");
        System.out.println(sb1.capacity()); // 52
        System.out.println(sb1.length()); // 47
    }
}
