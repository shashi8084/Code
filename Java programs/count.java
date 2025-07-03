public class count {
    
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == ' ' && i<s.length()-1){
            count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
