package exhaustivesearch;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 8;
		int b = 1;
		System.out.println(solution(a,b));

	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for(int i=3; i<sum; i++) {
        	if(sum%i==0) {
        		int tempb = sum/i;
        		int tempa = (brown+yellow)/tempb;
        		if(brown==2*tempa+2*(tempb-2)) {
        			if(tempa>tempb) {
        				answer[0] = tempa;
            			answer[1] = tempb;
        			} else {
        				answer[0] = tempb;
            			answer[1] = tempa;
        			}
        			
        			break;
        		}
        	}
        }
        
       
        return answer;
    }

}
