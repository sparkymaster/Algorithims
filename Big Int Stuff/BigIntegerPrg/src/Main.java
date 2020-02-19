import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;


public class Main {
	
	public static void main(String[] args) {
		
		
		Random rand = new Random() ;
		
		int c = 300000000;
		
		BigInteger a = new BigInteger(1,rand);
		BigInteger b = new BigInteger(1,rand);
		BigInteger a1 = new BigInteger(1,rand);
		BigInteger b1 = new BigInteger(1,rand);
//		System.out.println(a);
//		System.out.println(b);
//		
		long startTime = System.nanoTime();
		
		a = a.multiply(b);
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		//System.out.println(totalTime);
		
		a = new BigInteger(c,rand);
		b = new BigInteger(c,rand);
		
		a1 = new BigInteger(c,rand);
		b1 = new BigInteger(c/2+1,rand);
		
		startTime=System.nanoTime();
		
		//a = a.multiply(b);
		a1 = a1.divide(b1);
		
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		 
		System.out.println(totalTime);
		//System.out.println(a);
		
		a = new BigInteger(c,rand);
		b = new BigInteger(c,rand);
		a1 = new BigInteger(c,rand);
		b1 = new BigInteger(c/2+1,rand);
		
		startTime=System.nanoTime();
		
		//a = a.multiply(b);
		a1 = a1.divide(b1);
		
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		 
		System.out.println(totalTime);
		
		
		a = new BigInteger(c,rand);
		b = new BigInteger(c,rand);
		a1 = new BigInteger(c,rand);
		b1 = new BigInteger(c/2+1,rand);
		
		startTime=System.nanoTime();
		
		//a = a.multiply(b);
		a1 = a1.divide(b1);
		
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		 
		System.out.println(totalTime);
		a = new BigInteger(c,rand);
		b = new BigInteger(c,rand);
		a1 = new BigInteger(c,rand);
		b1 = new BigInteger(c/2+1,rand);
		
		startTime=System.nanoTime();
		
		//a = a.multiply(b);
		a1 = a1.divide(b1);
		
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		 
		System.out.println(totalTime);
		a = new BigInteger(c,rand);
		b = new BigInteger(c,rand);
		a1 = new BigInteger(c,rand);
		b1 = new BigInteger(c/2+1,rand);
		
		startTime=System.nanoTime();
		
		//a = a.multiply(b);
		a1 = a1.divide(b1);
		
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		 
		System.out.println(totalTime);
		a = new BigInteger(c,rand);
		b = new BigInteger(c,rand);
		a1 = new BigInteger(c,rand);
		b1 = new BigInteger(c/2+1,rand);
		
		startTime=System.nanoTime();
		
		//a = a.multiply(b);
		a1 = a1.divide(b1);
		
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		 
		System.out.println(totalTime);
		
		
		
	}

}
