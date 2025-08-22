import java.util.*;
public class anagram {
	public static boolean anagramcheck(String s1, String s2){
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1,arr2);
	}
	public static void main(String[] args){
		String s1 = "listen";
		String s2 = "silent";
		System.out.println(anagramcheck(s1, s2));
	}
}