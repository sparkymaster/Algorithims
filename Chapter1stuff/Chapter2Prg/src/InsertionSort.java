
public class InsertionSort {

		
public static int[] Sort(int[] alpha) {
		
		for (int j = 1; j<alpha.length;j++) {
			int key = alpha[j];
			int i = j-1;
			while(i>=0 && alpha[i]>key) {
				//System.out.println("I="+i);
				alpha[i+1] = alpha[i];
				//System.out.println(alpha[i]);
				i--;			
			}
			alpha[i+1] = key;
			
//			for(int x=0;x<j;x++) {
//				System.out.println(alpha[x]);
//			}
			
		}
		return alpha;
	}
	
	
	
	public static int[] InverseSort(int[] alpha) {
		for (int j = 1; j<alpha.length;j++) {
			int key = alpha[j];
			int i = j-1;
			while(i>=0 && alpha[i]<key) {
				//System.out.println("I="+i);
				alpha[i+1] = alpha[i];
				//System.out.println(alpha[i]);
				i--;			
			}
			alpha[i+1] = key;
			
//			for(int x=0;x<j;x++) {
//				System.out.println(alpha[x]);
//			}
			
		}
		return alpha;
	}
		
}
