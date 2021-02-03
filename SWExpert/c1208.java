package com.ssafy.algo.swea;

import java.util.Arrays;
import java.util.Scanner;

public class c1208 {
	
	static int[] box;
	
	static void Dump(int n) {
		if(n>0) {
			box[99]--;
			box[0]++;
			Arrays.sort(box);
			Dump(n-1);
		}
		else return;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			box = new int[100];
			int D = sc.nextInt();
			
			for(int j=0;j<100;j++) {
				box[j] = sc.nextInt();
			}
			
			Arrays.parallelSort(box);
			
			Dump(D);
			
			System.out.println("#"+(i+1)+" "+(box[99]-box[0]));
		}
		
		sc.close();
	}

}
