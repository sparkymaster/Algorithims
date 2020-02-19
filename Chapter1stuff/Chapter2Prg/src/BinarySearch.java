
public class BinarySearch {

	public static int Search(int[] alpha, int a) {
		int count = alpha.length;
		int low = 0;
		int high = alpha.length;
		int test = (high+low)/2;

		if(alpha[high-1] == a) {
			return high-1;
		}
		if(alpha[low] == a) {
			return low;
		}
		
		while(count>0) {
			
			if(alpha[test] == a) {
				return test;
			}
			if(a < alpha[test]) {
				high = test;
				test = (high+low)/2;
			}
			if(a > alpha[test]) {
				low = test;
				test = (high+low)/2;
			}
			
			
//			if((high-low)==1) {
//				if(a == alpha[high]) {
//					return high;
//				}
//				else if(a == alpha[low]) {
//					return low;
//				}
//				else {
//					return -1;
//				}
//				
//				
//			}
//			else if(a<alpha[(high+low)/2]) {
//				high = high/2;
//			}
//			else {
//				low = high/2;
//			}
				count--;
		}
		
		return -1;
	}
	
}
