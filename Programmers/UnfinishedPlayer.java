import java.util.*;


public class UnfinishedPlayer {
	
	 public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			
			String[] arr1 = {"A","b","C","f"};
			String[] arr2 = {"b","C","f"};
			
			
			System.out.println(solution(arr1,arr2));

		}
	
	
	    public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        int val = 0;
	        
	        Map <String, Integer> hm = new HashMap<>();
	        
	        for(String part : participant) {
	        	if(hm.get(part)== null)
	        		hm.put(part, 1);
	        	else {
	        		val=hm.get(part)+1;
	        		hm.put(part, val);
	        	}
	        }
	        
	        for(String comp : completion) {
	        	val = hm.get(comp)-1;
	        	hm.put(comp, val);
	        	
	        	
	        }
	        
	        for(String key : hm.keySet()) {
	        	if(hm.get(key)==1) answer = key;
	        }
	        return answer;
	        
	    }
	


}
