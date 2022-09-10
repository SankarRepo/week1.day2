package week1.day2;

public class ReverseString {
public static void main(String[] args) {
	
	String str = "hello";
	// convert to char array
	char[] chArr = str.toCharArray();
	
	for (int i=chArr.length-1; i>=0; i--) {
		System.out.println(chArr[i]);
		
	}
	
	for(int i=str.length()-1; i>=0;i-- ) {
		System.out.println(str.charAt(i));
	}
	
	
}
}
