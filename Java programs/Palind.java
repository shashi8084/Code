public class Palind {
    public static void main(String[] args) {
        int n = 1223;
        int rem = 0;
        int rev = 0;
        int temp = n;
        
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(rev == n){
                System.out.println("Is a Palindrome number.");
            }
            else{
                System.out.println("Not Palondrome.");
            }
        
    }
}
