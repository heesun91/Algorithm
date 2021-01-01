package array;

import java.util.*;

public class LargestNumber {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 30, 34, 5, 9};
		System.out.println(solution(arr));
		
	}
	
	public static String solution(int[] numbers) {
        String answer = "";
        
        String[] arr = new String[numbers.length];
        for(int i=0; i<numbers.length;i++) {
        	arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, new Comparator<String>(){
        	
        	public int compare(String s1, String s2) {
        		return (s2+s1).compareTo(s1+s2);
        	}
        	
        });
        
        if(arr[0].contentEquals("0")) return "0";
        for(int i=0; i<numbers.length;i++) {
        	answer+=arr[i];
        }
        
        
        
        return answer;
    }

}
