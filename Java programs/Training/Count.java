import java.util.Scanner;
public class Count {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int upper = 0;
        int lower = 0; 
        String str = in.nextLine();

        // if (str == ""){
        //     System.out.println("String is empty.");
        // }
        for(int i = 0; i < str.length(); i++){
            // char ch = str.charAt(i);
            if (str.charAt(i) >= 65 && str.charAt(i) <= 91){
                upper ++;
            }
            else{
                lower ++;
            }

        }
        System.out.println("upper case :" + " " + upper);
        System.out.println("lower case :" + " " + lower);
        in.close();
    }
}
