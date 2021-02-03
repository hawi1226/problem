package com.ssafy.algo.swea;

import java.util.Scanner;
//�߽ɺ��� Ž���ϴ°� �ξ� ����.
//���� ó������ Ž���غ����ٰ� �ڵ尡 �����.

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
				//d�� �پ�鶧
				
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
