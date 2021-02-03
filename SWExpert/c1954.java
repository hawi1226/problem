package com.ssafy.algo.swea;

import java.util.Scanner;

//달팽이 숫자
public class c1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		// 방향 전환
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		
		for(int i=0;i<T;i++) {
			//input
			int N = sc.nextInt();
			int x = 0,y = 0,d = 0;
			int[][] snale = new int[N][N];
		
			int num = 1;
			
			while(num != N*N + 1) {
				snale[y][x] = num++; //숫자 입력
				int tx = x + dx[d];
				int ty = y + dy[d];
				//방향 전환될때의 조건 확인 및 전환
				if(tx < 0 || ty < 0 || tx >= N || ty >= N || snale[ty][tx] != 0) {
					d++;
					if(d >= 4) d = 0;
				}
				x += dx[d]; //다음 인덱스로 이동
				y += dy[d];
			}
			//output
			System.out.println("#"+(i+1));
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					System.out.print(snale[j][k]+ " ");
				}
				System.out.println();
			}
		}
		
		sc.close();

	}

}
