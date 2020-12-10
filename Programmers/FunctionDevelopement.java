package functionDevelopment;

import java.util.*;
public class FunctionDevelopement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr1 = {93,30,55};
				
		
		System.out.println(solution(arr1));
		
		class Solution {
		    public int[] solution(int[] progresses, int[] speeds) {
		       
		        Stack<Integer> stack = new Stack<Integer>();
		        
		        for(int i=progresses.length - 1; i>=0;i--) {
		        	stack.push((100-progresses[i])/speeds[i]+((100-progresses[i])%speeds[i]>0?1:0));
		        }
	        	List<Integer> s = new ArrayList<Integer>();
	        	
	        	while(!stack.empty()) {
	        		int cnt = 1;
	        		
	        		int top = stack.pop();
	        		
	        		while(!stack.empty()&&stack.peek()<=top){
	        			cnt++;
	        			stack.pop();
	        		}
	        		
	        		s.add(cnt);
	        	}
	        	int[] answer = new int[s.size()];
	        	
	        	for(int i=0;i<answer.length; i++) {
	        		answer[i] = s.get(i);
	        	}
	        	return answer;
		        }
		        
		        
		    
		}

	}

	private static char[] solution(Integer[] arr1) {
		// TODO Auto-generated method stub
		return null;
	}

}
