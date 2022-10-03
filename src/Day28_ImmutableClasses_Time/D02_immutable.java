package Day28_ImmutableClasses_Time;

public class D02_immutable {
    public static void main(String[] args) {

        String a="";
        a="2";
        a+='c';
        a+=false;
        String b="2cfalse";
        String c= "" + 2+ 'c'+false;

        System.out.println(a=="2cfalse"); // false

        System.out.println(b=="2cfalse"); // true

        System.out.println(c=="2cfalse"); // true

        String str="";

        for (int i = 1; i <=100 ; i++) {
            str+=i;
        }
        // Java kac obje olusturur? 101
        System.out.println(str);


        if (a=="2cfalse"){
            System.out.println("==");
        }
        if (a.equals("2cfalse")){
            System.out.println("equals"); // equals
        }


    }
}