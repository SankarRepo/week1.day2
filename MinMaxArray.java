package week1.day2;

import java.util.Arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		
		int[] val = {34,53,23,4,64,23,6464,25,33,85,97,90};
		Arrays.sort(val);
		int length = val.length;
		System.out.println("Min value of the Array is" +" " +val[0]);
		System.out.println("Max value of the Array is" +" " +val[length-1]);
		
		
		
	}	
}
