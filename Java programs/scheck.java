public class scheck {
    public static void main(String[] args) {
        String S1 = "Shashi";
        String S2 = "Shashi";
        String S5 = new String("Shashi");
        System.out.println(S1 == S2);
        System.out.println(S1.equals(S5));

        
        StringBuffer S3 = new StringBuffer("Shekhar");
        StringBuffer S4 =new StringBuffer("Shekhar");
        System.out.println(S3 == S4);
        System.out.println(S3.equals(S4));
    }
}
