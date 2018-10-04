package Algorithm;

import java.util.Scanner;

public class FibIterative {
public static void main(String[]argv) {
	System.out.print("請輸入要計算哪一個費氏數:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(fib2(n));
//	int Fib[] = new int[n];
//	
//	Fib[0] = 0;
//	Fib[1] = 1;
//	for(int i=2;i<n;i++) {
//		Fib[i] = Fib[i-1]+Fib[i-2];
//	}
//	
//	
//	for(int sum:Fib) {
//		System.out.println(sum);
//	}

}
	static int fib2 (int n) {
		int f[] = new int[n];
		n-=1;
		f[0] = 0;
		if(n > 0) {
			f[1] = 1;
			for(int i=2;i<=n;i++) {
				f[i] = f[i-1] + f[i-2];
			}
		}
		return f[n];
	}
}
