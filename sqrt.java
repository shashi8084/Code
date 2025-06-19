import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double root = Math.sqrt(num);
        int Squareroot = (int)root;
        System.out.println(Squareroot);
        sc.close();
    }
}
