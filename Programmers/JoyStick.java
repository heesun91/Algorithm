package greedy;


public class JoyStick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JANG";
		System.out.println(solution(name));
	}
	
	public static int solution(String name) {
        int answer = 0;
        int len = name.length();
        int min_move  = name.length()-1;
        for(int i=0;i<name.length();i++) {
        	if(name.charAt(i)<'N') {
        		answer+= name.charAt(i)-'A';
        	}else {
        		answer+='Z'-name.charAt(i)+1;
        	}
        	int next = i+1;
        	while(next<len && name.charAt(next)=='A') {
				++next;
			}
        	min_move = Math.min(min_move,i+len-next+Math.min(i,len-next));
        }
        
        answer+= min_move;
        return answer;
    }

}
