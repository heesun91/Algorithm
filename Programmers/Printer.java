package printer;

import java.util.*;

public class Printer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 1, 3, 2};
		int b = 2;		
		System.out.println(solution(a,b));
	}	
		
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0; i<priorities.length;i++) {
        	q.add(priorities[i]);        	
        }      
        
        while(!q.isEmpty()) {
        	
        	boolean flag = false;
	        for(int i=0; i<q.size();i++) {
	        	if(q.peek()<(int)(q.toArray()[i])) {
	        	//if(q.peek()<priorities[i]) { 이거로 하면 시간초과,. 
	        		flag= true;
	        		break;
	        	}       		
	        }
	        
	        if(flag) {
	        	q.add(q.poll());
	        	location--;
	        	if(location<0) {
	        		location = q.size()-1;
	        	}
	        }
	        else {
	        	if(location==0) {
	        		answer++;
	        		q.clear();
	        	}else {
	        		q.poll();
		        	location--;
		        	answer++;
		        	if(location<0) {
		        		location=q.size()-1;
		        	}
	        	}
	        	
	        }	        
        }
        return answer;
    }
    
	

}
