package Algorithm;

import java.util.Scanner;

public class Fib {
public static void main(String[]argv) {
	System.out.print("輸入要計算第幾個費氏數：");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("第"+n+"個費氏數是："+fib(n));
}
	static int fib(int n) {
		if(n < 2) {
			return n;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
}
