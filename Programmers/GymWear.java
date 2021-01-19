package greedy;
import java.util.*;

public class GymWear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {3};
		
		System.out.println(solution(n,lost,reserve));

	}
	
	 public static int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        int brrow =0;
	        int loster = 0;
	        int[] student = new int[n];
	        for(int i=0; i<n; i++) {
	        	student[i]=i;
	        }
	        
	        for(int i=0; i<lost.length; i++) {
	        	for(int j=0; j<reserve.length; j++) {
	        		if(lost[i]==reserve[j]) {
	        			lost[i]=-1;
	        			reserve[j]=-1;
	        			loster++;
	        			break;
	        		}	        		
	        	}	        	
	        }
	        
	       for(int i=0; i<lost.length; i++) {
	        	for(int j=0; j<reserve.length; j++) {
	        		if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
	        			brrow++;
	        			lost[i]=-1;
	        			reserve[j]=-1;
	        			break;
	        		}
	        	}
	       }
	       
	       answer = n-lost.length +brrow+loster;
	        
	        
	        return answer;
	    }

}
