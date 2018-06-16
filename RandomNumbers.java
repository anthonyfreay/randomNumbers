package randomNumbers;

import java.util.*;
import java.io.*;

public class RandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[100];
		int total = 0;
		int summation = 0;
		double stdev = 0.0;
		final int size = 100;
		double mean;
		
		for(int i = 0; i<size; i++) {
			numbers[i] = random.nextInt(99)+1;
			total += numbers[i];
		}
		
		Arrays.sort(numbers);
		mean = (double)total / size;
		
		for(int i = 0; i<size; i++) {
			summation+=Math.pow((numbers[i]-mean), 2);
		}
		stdev = Math.sqrt((double)summation/size);
		
		System.out.println("Min:\t" + numbers[0]);
		System.out.println("Max:\t" + numbers[99]);
		System.out.println("Mean:\t" + mean);
		System.out.println("Std dev:\t" + stdev);
		
		
	}

}
