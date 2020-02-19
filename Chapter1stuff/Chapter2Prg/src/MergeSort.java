
public class MergeSort {
	
	public static void Merge(double[] array, int p, int q, int r) {
		int num1 = q-p+1;
		int num2 = r-q;
		double[] left = new double[num1+1];
		double[] right = new double[num2+1];
		for(int i = 0; i<num1;i++) {
			left[i] = array[p+i];
		}
		for(int j = 0;j<num2;j++) {
			right[j] = array[q+j+1];
		}
		left[num1] = Double.POSITIVE_INFINITY;
		right[num2] = Double.POSITIVE_INFINITY;
		int i =0;
		int j = 0;
		for(int k = p;k<r+1;k++) {
			if(left[i]<right[j]) {
				array[k] = left[i];
				i++;
			}
			else {
				array[k] = right[j];
				j++;
			}
		}
	}
		

	

	public static double[] Mergesort(double[] array, int p, int r){
		if(p<r){
			int q = (p+r)/2;
			Mergesort(array,p,q);
			Mergesort(array,q+1,r);
			Merge(array,p,q,r);
		}
		return array;
	}
	
	
}
