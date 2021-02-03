package com.ssafy.algo.swea;

import java.util.Scanner;

//������ ����
public class c1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		// ���� ��ȯ
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		
		for(int i=0;i<T;i++) {
			//input
			int N = sc.nextInt();
			int x = 0,y = 0,d = 0;
			int[][] snale = new int[N][N];
		
			int num = 1;
			
			while(num != N*N + 1) {
				snale[y][x] = num++; //���� �Է�
				int tx = x + dx[d];
				int ty = y + dy[d];
				//���� ��ȯ�ɶ��� ���� Ȯ�� �� ��ȯ
				if(tx < 0 || ty < 0 || tx >= N || ty >= N || snale[ty][tx] != 0) {
					d++;
					if(d >= 4) d = 0;
				}
				x += dx[d]; //���� �ε����� �̵�
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
