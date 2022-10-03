package Day07_TernaryOperator;

import java.util.Scanner;

public class D03_Ternary3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen Bir Harf Giriniz");
        char harf= scanner.next().charAt(0);

        System.out.println(harf >= 'a' && harf <= 'z' ? (char) (harf - 32) : harf);


    }
}
