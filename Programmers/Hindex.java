package array;


public class Hindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] citations = {3, 0, 6, 1, 5};
		int[] citations = {1,4,9,3, 0, 6, 1, 5};
		
		System.out.println(solution(citations));

	}
	
	 public static int solution(int[] citations) {
	        int answer = 0;
	       
	     
	        int sum = 0;
	        for(int i=0; i<citations.length;i++) {
	        	sum += citations[i];
	        }
	        int avg = sum/citations.length;
	        
	        while(avg!=answer) {	        	
	        	answer = 0;
	        	for(int i=0; i<citations.length;i++) {	        		
		        	if(citations[i]>=avg) answer++;		        	
		        }
	        	
	        	if(avg>answer) avg--;
	        	else if(avg<answer)avg++;
	        }
	        
	        return answer;
	    }

}
