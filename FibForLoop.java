package Algorithm;

import java.util.Scanner;

public class FibForLoop {
public static void main(String[]argv) {
	System.out.print("�п�J�n�p����@�ӶO���:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a,b,c;
	if(n < 2) {
		System.out.printf("�� %d �� �O��� �O %d",n,n);
	}
	a = 0;
	b = 1;
	c = 0;
	for(int i=2;i<=n;i++) {
		c = a+b;
		a = b;
		b = c;
	}
	
	System.out.printf("�� %d �ӶO��� �O %d",n,c);
	
}
}
