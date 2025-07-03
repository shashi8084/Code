public class largeststring {
    public static String islargeststring(String fruits[]){

        String largest = fruits[0];
        for(int i = 0; i < fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[] ={"apple", "banana", "mango"};
        System.out.println(islargeststring(fruits));
    }
}
