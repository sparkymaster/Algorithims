
public class BubbleSort {

	public static int[] Sort(int[] alpha) {
		
		int temp = 0;
		for(int i = 0; i<alpha.length-2;i++) {
			for(int j = alpha.length-1;j>=i+1; j--) {
				if(alpha[j] < alpha[j-1]) {
					temp = alpha[j];
					alpha[j]=alpha[j-1];
					alpha[j-1] = temp;
				}
			}
			
			
		}
		
		return alpha;
	}
	
}
