package com.ssafy.algo;

import java.util.Scanner;

public class bj1244 {

	static int[] ss;
	
	static void switchs(int idx) {
		if(ss[idx] == 1) ss[idx] = 0;
		else ss[idx] = 1;
	}
	
	static void male(int num) {
		for(int i=num-1;i<ss.length;i+=num) {
			switchs(i);
		}
	}
	
	static void female(int idx,int d) {
		if((idx+d < ss.length) && (idx-d >= 0)){
			if(ss[idx+d] == ss[idx-d]) {
				switchs(idx+d);
				switchs(idx-d);
				System.out.println("switched");
				female(idx,++d);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ss = new int[N];
		
		for(int i=0;i<N;i++) {
			ss[i] = sc.nextInt();
		}
		
		int T = sc.nextInt();
		int sex,num;
		
		for(int i=0;i<T;i++) {
			sex = sc.nextInt();
			num = sc.nextInt();
			
			if(sex == 1) male(num);
			else if(sex == 2) { 
				switchs(num - 1);
				female(num-1,1);
			}
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(ss[i]+" ");
            if((i+1)%20 == 0) System.out.println();
		}
		
		sc.close();
	}

}
