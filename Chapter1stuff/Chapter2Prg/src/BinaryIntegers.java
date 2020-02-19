
public class BinaryIntegers {

	public static int[] Sum(int[] a, int[] b) throws CustomException {
		
		
		if(a.length!=b.length) {
			throw new CustomException("Didn't have same length.");		
		}
		else {
			
			int[] c  = new int[b.length+1];
			int temp = 0;
			for(int x = 0;x<b.length;x++) {
				if(a[x]==1 && b[x]==1){
					if(temp==1) {
						c[x] = 1;
						temp=1;
					}
					else {
						c[x]=0;
						temp = 1;
					}
				}
				if((a[x]==1 && b[x]==0)||(a[x]==0 && b[x]==1)) {
					if(temp==1) {
						c[x] = 0;
						temp=1;
					}
				else {
					c[x] = 1;
					temp=0;
					}
				}
				if(a[x]==0 && b[x]==0 ) {
					if(temp==1) {
						c[x] = 1;
						temp = 0;
					}else {
						c[x] = 0;
						temp=0;
					}
				}
				
				
			}
			
			if(temp == 1) {
				c[c.length-1] = 1;
			}
			
			for(int x = 0;x<c.length;x++) {
				//System.out.println(c[x]);
			}
			
			return c;
			
		}
		
		
		
	}
	
	
}
