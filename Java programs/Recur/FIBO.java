public class FIBO {
    public static int printfibo(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;

        int FNM1 = printfibo(n - 1);
        int FNM2 = printfibo(n - 2);
        int FN = FNM1 + FNM2;
        return FN;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printfibo(n));
    }
}
