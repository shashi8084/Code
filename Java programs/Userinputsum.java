import java.util.Scanner;

public class Userinputsum {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("A :"  );
        int a = sc.nextInt();

        System.out.print("B :" );
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is : " + sum);
        sc.close();
    }
}
