
public class Palindrome {
    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length() / 2; i++){
            // int n = str.length();
            if(str.charAt(i) !=  str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123456";
        System.out.println(isPalindrome(str));
    }
}
