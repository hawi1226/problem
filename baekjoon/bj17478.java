package com.ssafy.algo;

import java.util.Scanner;

public class bj17478 {
	
	public static void print(int N,int C) {
		if(N == 0) {
			for(int i =0;i<C;i++) System.out.print("____");
			System.out.println("\"����Լ��� ������?\"");
			for(int i =0;i<C;i++) System.out.print("____");
			System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			return;
		}
		else {
			for(int i =0;i<C;i++) System.out.print("____");
			System.out.println("\"����Լ��� ������?\"");
			for(int i =0;i<C;i++) System.out.print("____");
			System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			for(int i =0;i<C;i++) System.out.print("____");
			System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			for(int i =0;i<C;i++) System.out.print("____");
			System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			print(N-1,++C);
			for(int i =0;i<C;i++) System.out.print("____");
			System.out.println("��� �亯�Ͽ���.");
		}
		
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		
		print(N,0);
		
		System.out.println("��� �亯�Ͽ���.");

		sc.close();
	}

}
