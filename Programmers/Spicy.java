package heap;

import java.util.PriorityQueue;

public class Spicy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 9, 10, 12};
		int b = 7;		
		System.out.println(solution(a,b));
	}
	
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for( int i :scoville ) {
        	heap.offer(i);
        }
        
        while(heap.peek()<=K) {
        	if(heap.size()==1) {
        		return -1;
        	}
        	int a = heap.poll();
        	int b = heap.poll();
        	
        	heap.offer(a+b*2); 
        	
        	answer++;
        }
        
        
        
        return answer;
    }
	

}
