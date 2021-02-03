package com.ssafy.algo.swea;

import java.util.Scanner;
//중심부터 탐색하는게 훨씬 낫다.
//괜히 처음부터 탐색해보려다가 코드가 길어짐.

public class c2805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=0;t<T;t++) {
			int N = sc.nextInt();
			
			int[][] farm = new int[N][N];
			
			for(int i=0;i<N;i++) {
				String in = sc.next();
				for(int j=0;j<N;j++) {
					farm[i][j] = in.charAt(j) - '0';
				}
			}
			
			int d = N/2;
			int result = 0;
			
			if(N==1) result = farm[0][0];
			else {
				int i = 0;
				//d가 줄어들때
				
				for(;i<=N/2;i++) {
					for(int j=0;j<N-(d*2);j++) {
						result += farm[i][d+j];
						System.out.print(farm[i][d+j]);
					}
					d--;
					System.out.println();
				}
				d=1;
				for(;i<N;i++) {
					for(int j=0;j<N-(d*2);j++) {
						result += farm[i][d+j];
						System.out.print(farm[i][d+j]);
					}
					d++;
					System.out.println();
				}
			}
			
			System.out.println(result);
			/*
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.print(farm[i][j]);;
				}
				System.out.println();
			}*/
		}
		
		
		sc.close();
	}

}
