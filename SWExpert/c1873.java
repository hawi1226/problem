package com.ssafy.algo.swea;

import java.util.Scanner;

public class c1873 {
	
	static int s,x,y; // ������ �ٶ󺸴� ����,���� ��ġ
	static char[][] map;
	//���� ���ϰ� �����϶�
	static void Up() {
		s = 1;
		if(y - 1 >= 0 && map[y-1][x] == '.') {
			map[y][x] = '.'; map[y-- - 1][x] = '^';
		}
		else map[y][x] = '^';
	}
	//�Ʒ��� ���ϰ� �����϶�
	static void Down() {
		s = 2;
		if(y + 1 < map.length && map[y+1][x] == '.') {
			map[y][x] = '.'; map[y++ + 1][x] = 'v';
		}
		else map[y][x] = 'v';
	}
	//�������� ���ϰ� �����϶�
	static void Left() {
		s = 3;
		if(x - 1 >= 0 && map[y][x - 1] == '.') {
			map[y][x] = '.'; map[y][x-- - 1] = '<';
		}
		else map[y][x] = '<';
	}
	//���������� ���ϰ� �����϶�
	static void Right() {
		s = 4;
		if(x + 1 < map[0].length && map[y][x + 1] == '.') {
			map[y][x] = '.'; map[y][x++ + 1] = '>';
		}
		else map[y][x] = '>';
	}
	//��ź�� ���
	static void Shoot() {
		switch (s) {//1:�� 2:�Ʒ� 3:���� 4:������
		case 1:
			for(int i=1;y - i >=0;i++) {
				if(map[y - i][x] == '*') { 	//������ �νô� ���
					map[y - i][x] = '.'; break;
				}
				else if(map[y - i][x] == '#') break; //ö���� ���õǴ� ���
			}
			break;
		case 2:
			for(int i=1;y + i < map.length;i++) {
				if(map[y + i][x] == '*') {
					map[y + i][x] = '.'; break;
				}
				else if(map[y + i][x] == '#') break;
			}
			break;
		case 3:
			for(int i=1;x - i >= 0;i++) {
				if(map[y][x - i] == '*') {
					map[y][x - i] = '.'; break;
				}
				else if(map[y][x - i] == '#') break;
			}
			break;
		case 4:
			for(int i=1;x + i < map[0].length;i++) {
				if(map[y][x + i] == '*') {
					map[y][x + i] = '.'; break;
				}
				else if(map[y][x + i] == '#') break;
			}
			break;
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=0;t<T;t++) {
			//input
			int H = sc.nextInt();
			int	W = sc.nextInt();
			
			map = new char[H][W];
			String input;
			
			for(int i=0;i<H;i++) {
				input = sc.next();
				map[i] = input.toCharArray();
			}
			//���� ã�� ��ġ �� �ٶ󺸴� ���� ����
			for(int i=0;i<map.length;i++) {
				for(int j=0;j<map[0].length;j++) {
					if(map[i][j] == '^') {s = 1;x = j;y = i;}
					else if(map[i][j] == 'v') {s = 2;x = j;y = i;}
					else if(map[i][j] == '<') {s = 3;x = j;y = i;}
					else if(map[i][j] == '>') {s = 4;x = j;y = i;}
				}
			}
			
			int N = sc.nextInt();
			input = sc.next();
			
			for(int i=0;i<N;i++) {
				if(input.charAt(i) == 'U') Up();
				else if(input.charAt(i) == 'D') Down();
				else if(input.charAt(i) == 'L') Left();
				else if(input.charAt(i) == 'R') Right();
				else if(input.charAt(i) == 'S') Shoot();
				/* *���ܺ� �� Ȯ��*
				for(int k=0;k<map.length;k++) {
					for(int j=0;j<map[0].length;j++) {
						System.out.print(map[k][j]);
					}
					System.out.println();
				}
				System.out.println("-------"+input.charAt(i)+"----------");*/
			}
			
			//output
			for(int i=0;i<map.length;i++) {
				for(int j=0;j<map[0].length;j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
		
		sc.close();
	}

}
