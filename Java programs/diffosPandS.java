public class diffosPandS {

    public static int isdiff(int n){
        int sum = 0;
        int product = 1;
        int x = 0;
        while(n > 0){
            x = n % 10;
            sum += x;
            product *= x;
            n = n / 10;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        int n = 234;
        System.out.println(isdiff(n));
    }
}
