package Algorithm;

import java.util.Scanner;

public class Fib {
public static void main(String[]argv) {
	System.out.print("��J�n�p��ĴX�ӶO��ơG");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("��"+n+"�ӶO��ƬO�G"+fib(n));
}
	static int fib(int n) {
		if(n < 2) {
			return n;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
}
