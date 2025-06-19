import java.util.Scanner;
public class factorial {
    public static int fact(int num){

        int Facto = 1;
        for(int i = 1; i <= num; i++){
            Facto = Facto * i;
        }
        System.out.println(Facto);
        return num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num : ");
        int num = sc.nextInt();
        fact(num);
        sc.close();
    }
}
