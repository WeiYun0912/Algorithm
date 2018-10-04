package Algorithm;

import java.util.Scanner;

public class FibForLoop {
public static void main(String[]argv) {
	System.out.print("請輸入要計算哪一個費氏數:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a,b,c;
	if(n < 2) {
		System.out.printf("第 %d 個 費氏數 是 %d",n,n);
	}
	a = 0;
	b = 1;
	c = 0;
	for(int i=2;i<=n;i++) {
		c = a+b;
		a = b;
		b = c;
	}
	
	System.out.printf("第 %d 個費氏數 是 %d",n,c);
	
}
}
