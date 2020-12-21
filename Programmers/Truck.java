package truck;
import java.util.*;

public class Truck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,4,5,6};
		int b = 2;
		int weight = 10;
		
		System.out.println(solution(b,weight,a));

	}
    
    	public static int solution(int bridge_length, int weight, int[] truck_weights) {
    		
    		int[] endTime = new int[truck_weights.length];
    		
    		int time=0;
    		int cur=0;
    		Queue<Integer> onBridge = new LinkedList<>();
    		
    		while(true) {
    			
    			if(! onBridge.isEmpty() && endTime[onBridge.peek()] == time) {
    				weight +=truck_weights[onBridge.poll()];
    			}
    			if(cur < truck_weights.length && truck_weights[cur]<=weight) {
    				onBridge.add(cur);
    				endTime[cur] = time + bridge_length;
    				weight -= truck_weights[cur];
    				cur++;
    			}
    			
    			time++;
    			if(onBridge.isEmpty())
    				break;
    		}
    				
            return time;
        }
	

}
