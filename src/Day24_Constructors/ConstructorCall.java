package Day24_Constructors;

    public class ConstructorCall {

        ConstructorCall(){
            System.out.println("parametresiz cons. calisti");
        }
        ConstructorCall(int sayi){
            this();
            System.out.println("parametreli cons. calisti");
        }
        public static void main(String[] args) {
            ConstructorCall obj=new ConstructorCall(20);
        }


    }
