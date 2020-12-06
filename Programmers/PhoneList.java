package phoneList;

import java.util.HashMap;

public class PhoneList {
	
	 public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			
			String[] arr1 = {"119","976716","11955432321","213213"};
			String[] arr2 = {"123","456","789"};
			
			
			System.out.println(solution(arr2));

		}
	
	
	    public static boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        HashMap <String, String> hashMap = new HashMap<>();
	        
	        for(int i=0; i<phone_book.length; i++) {
	        	hashMap.put(phone_book[i], "prefix");
	        }
	        
	        for(String phone : phone_book) {
	        	for(int idx=0; idx<phone.length();idx++) {
	        		if(hashMap.containsKey(phone.substring(0,idx))) {
	        			answer= false;
	        		}
	        	}
	        }
	        return answer;
	    }
	 
	
	

}
