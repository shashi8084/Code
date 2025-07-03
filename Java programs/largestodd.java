public class largestodd {
    public static String largestOddNumber(String num) {
        
        for(int i = num.length() - 1; i >= 0 ; i--){
            char c = num.charAt(i);
            if((c - '0') % 2 == 1){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String num = "2235365";
        System.out.println(largestOddNumber(num));
    }
}
