package greedy;

public class MakeBiggestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "177252841";
		int k = 2;
		System.out.println(solution(number,k));

	}
	
	 public static String solution(String number, int k) {
		    StringBuilder answer = new StringBuilder();
		    int idx=0;
		    char max;
		    for(int i=0;i<number.length()-k;i++){
		        max='0';
		        for(int j=idx; j<=k+i; j++){
		            if(max<number.charAt(j)){
		                max=number.charAt(j);
		                idx=j+1;
		            }
		        }
		        answer.append(max);
		    }
		       
		    
		    return answer.toString();
		}

}
