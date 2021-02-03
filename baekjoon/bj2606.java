package com.ssafy.algo;

import java.util.Scanner;

public class bj2606 {
	static int[][] com;
	static int[] check;
	static int N;
	
	public static void spread(int num) {
		for(int i=1;i<=N;i++) {
			if(com[num][i] == 1 && check[i] == 0) {
				check[i] = 1;
				spread(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		check = new int[N+1];
		com = new int[N+1][N+1];
		//바이러스가 걸려있으면 1, 아니면 0
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				com[i][j] = 0;
			}
		}
		
		int C = sc.nextInt();
		int x,y;
		for(int i = 0;i<C;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			com[x][y] = 1;
			com[y][x] = 1;			
		}
		
		
		//check
		check[1] = 1;
		spread(1);
		
		int result = 0;
		
		for(int i=2;i<=N;i++) {
			if(check[i] == 1) result++;
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
