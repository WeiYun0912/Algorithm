package Algorithm;

public class Polynomial {
public static void main(String[]argv) {
	int array[] = {1,2,3,4};
	polynomial(3,array,array.length);
}
	static void polynomial(int c,int a[],int n) {
		int power = 1;
		int y = a[0];
		
		for(int i=1;i<n;i++) {
			power = power*c;
			y = y+a[i]*power;
		}
		System.out.println(y);
	}
}
