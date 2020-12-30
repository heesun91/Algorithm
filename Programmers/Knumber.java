




package array;

import java.util.*;
public class Knumber {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 5, 2, 6, 3, 7, 4};
		int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		
		System.out.println(solution(a,b));
	}
	
	 public static int[] solution(int[] array, int[][] commands) {
		 int[] answer = new int[commands.length];
  
   
        for(int j=0;j<commands.length;j++) {
        	int[] temp = new int[commands[j][1] - (commands[j][0]-1)];
	        for(int i=0; i<=commands[j][1]-commands[j][0]; i++) {
	        	temp[i] = array[commands[j][0]+i-1];
	        	        	
	        }
	        Arrays.sort(temp);
	        int k=temp[commands[j][2]-1];
        	answer[j]= k;
        }
        	
        
        return answer;
	    }

}
