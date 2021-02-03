package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class bj5600 {
	
	static int N,a,b,c;
	static int[] arrA,arrB,arrC,arrR,result;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		N = sc.nextInt();
		
		result = new int[a+b+c+1];
		Arrays.fill(result, 2);
		arrA = new int[N];
		arrB = new int[N];
		arrC = new int[N];
		arrR = new int[N];
		
		for(int i=0;i<N;i++) {
			arrA[i] = sc.nextInt();
			arrB[i] = sc.nextInt();
			arrC[i] = sc.nextInt();
			arrR[i] = sc.nextInt();
			
			if(arrR[i] == 1) {
				result[arrA[i]] = 1;
				result[arrB[i]] = 1;
				result[arrC[i]] = 1;
			}
		}
		
		for(int i=0;i<N;i++) {
			int sum = 0;
			if(arrR[i] == 0) {
				sum = result[arrA[i]] + result[arrB[i]] + result[arrC[i]];
				if(sum == 4) {
					if(result[arrA[i]] == 2) result[arrA[i]] = 0;
					else if(result[arrB[i]] == 2) result[arrB[i]] = 0;
					else if(result[arrC[i]] == 2) result[arrC[i]] = 0;
				}
			}
		}
		
		for(int i = 1;i<a+b+c+1;i++) {
			System.out.println(result[i]);
		}
		
		
		sc.close();
	}

}
