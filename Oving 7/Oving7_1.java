public class Oving7_1 {
    
    private static String testStr = "Vi forkorter denne setningen";
    private static NyString s = new NyString(testStr);

    public static void main(String[] args) {

        System.out.println(s.forkort());
        System.out.println(s.fjernBokstav("e"));// Vi forkortr dnn stningn
    }

}