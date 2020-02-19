
public class Main{
	
	
	public static void main(String[] args) throws CustomException {
		
	
		//System.out.println("Hello World");
		int[] alpha = {31,41,59,26,41,58};
//		
		
		
		//System.out.println(alpha[0]);
		//System.out.println(beta[0]);
		//System.out.println(alpha[3]);
//		System.out.println("Array prior to sorting with insertion sort:  ");
//		for(int x = 0;x<alpha.length;x++) {
//			 System.out.print(" "+alpha[x]+",");
//		 }
//		System.out.println(" ");
//		System.out.println("Array after sorting in insertion sort:  ");
		int[] beta = InsertionSort.Sort(alpha);
//		
//		
//		 for(int x = 0;x<beta.length;x++) {
//			 System.out.print(" "+beta[x]+",");
//		 }
		 
//		 int[] test =  {31,41,59,26,41,58};
//		 
//		 //System.out.println("Array prior to sorting with reverse-insertion sort:  ");
//			for(int x = 0;x<test.length;x++) {
//				// System.out.print(" "+test[x]+",");
//			 }
//			System.out.println(" ");
//		 
//		int[] gamma = InsertionSort.InverseSort(test);
//		 
//		System.out.println("Array after sorting with reverse-insertion sort:  ");
//		for(int x = 0;x<gamma.length;x++) {
//			 System.out.print(" "+gamma[x]+",");
//		 }
//		System.out.println(" ");
	
//		 int[] bin = {0,1,0,1,0,1};
//		 int[] bin2 = {1,0,1,1,1,1};
//		 
//		 System.out.println("Two arrays before they are summed:");
//		 
//		 for(int x = bin.length;x>0;x--) {
//			 System.out.print(bin[x-1]+", ");
//		 }
//		 System.out.println(" ");
//		 for(int x = bin2.length;x>0;x--) {
//			 System.out.print(bin2[x-1]+", ");
//		 }
//		 System.out.println(" ");
//		 
//		 
//		 int[] binans = BinaryIntegers.Sum(bin, bin2);
//		 System.out.println("Here is their sum");
//		 for(int x = binans.length;x>0;x--) {
//			System.out.print(binans[x-1]+", ");
//		 }
		 
//		 double[] m1 = {12.1, 18.2, 13.4, 14.3, 12.2};
//		 System.out.println("Here is the double array prior to sorting.");
//		 
//		 for(int x = 0; x< m1.length;x++) {
//			 System.out.print(m1[x]+", ");
//		 }
//		 
//		 System.out.println(" ");
//		 double[] m2 = MergeSort.Mergesort(m1, 0, m1.length-1);
//		 System.out.println("Here it is after the sorting.");
//		 
//		 for(int x = 0;x<m1.length;x++) {
//			 System.out.print(m2[x]+", ");
//		 }
//		 
//		 System.out.println("59 is located at index "+BinarySearch.Search(alpha, 59));
//		 System.out.println("32 is located at index "+BinarySearch.Search(beta, 32));
//		 
		 int[] test1 =  {31,41,59,26,41,58};
		 
		 
		 System.out.println("Here is the array before it is sorted by bubblesort.");
		
		 for(int x = 0;x<test1.length;x++) {
			 System.out.print(test1[x]+", ");
		 }
		 
		 BubbleSort.Sort(test1);
		
		 System.out.println(" ");
		 
		 System.out.println("Here is the array after it is sorted.");
		 for(int x = 0;x<test1.length;x++) {
			 System.out.print(test1[x]+", ");
		 }
		 
	}
	
		

	
}
