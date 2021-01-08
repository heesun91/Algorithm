package exhaustivesearch;


import java.util.*;

public class MockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		
		System.out.println(solution(a));

	}
	
	
	public static int[] solution(int[] answers) {
        
       
        int[][] supoja = {{1,2,3,4,5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int cnt1 =0;
        int cnt2 =0;
        int cnt3 =0;
        for(int i=0; i<answers.length;i++) {
        	if(answers[i]==supoja[0][i%supoja[0].length]) cnt1++;
        	if(answers[i]==supoja[1][i%supoja[1].length]) cnt2++;
        	if(answers[i]==supoja[2][i%supoja[2].length]) cnt3++;
        	
        }
        int max=cnt1;
        if(cnt2>max) max= cnt2;
        if(cnt3>max) max= cnt3;
        
        List<Integer> winner = new ArrayList<Integer>();
        
        if(cnt1==max) winner.add(0);
        if(cnt2==max) winner.add(1);
        if(cnt3==max) winner.add(2);    
        
        int[] answer = new int[winner.size()];
        
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
        System.out.println(winner.size());
        for(int i=0; i<winner.size(); i++) {
        	answer[i] = winner.get(i);
        }
        Arrays.sort(answer);
        	
        
        
        return answer;
    }

}
