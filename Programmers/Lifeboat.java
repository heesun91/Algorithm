package greedy;

import java.util.*;

public class Lifeboat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] p = {90,70,40,50,60,80,70,55,75,100,45};
		int limit = 100;
		

		
		System.out.println(solution(p,limit));

	}
	
	public static int solution(int[] people, int limit) {
        int answer = 0;
        int min =0;
        Arrays.sort(people);
       
        
        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++;
            answer++;
          }
        
        return answer;
    }

}
