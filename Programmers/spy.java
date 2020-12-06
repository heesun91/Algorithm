package spy;

import java.util.HashMap;
public class spy {
	
	 public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			
			String[][] arr1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
			
			
			
			System.out.println(solution(arr1));

		}
	

	
	    public static int solution(String[][] clothes) {
	        int answer = 1;
	        
	        HashMap <String,Integer> hash = new HashMap<>();
	        
	        for(int i=0;i<clothes.length;i++) {	        	
	        	if(!hash.containsKey(clothes[i][1])) {
	        		hash.put(clothes[i][1],1);
	        	}else {
	        	hash.put(clothes[i][1],hash.get(clothes[i][1])+1);
	        	}
	        }
	        
	        
	        for(String key : hash.keySet()) {
	        	answer*=hash.get(key)+1	;        	
	        }
	        answer= answer-1;
	        return answer;
	    }
	

}
