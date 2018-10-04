package Algorithm;

public class BinaryCount {
public static void main(String[]argv) {
	int count = 1;
	int n = 16;
	while(n > 1) {
		count +=1;
		n /=2;
	}
	System.out.println(count); // ex:n=10 , 1010 4個個數
							   // ex:n=16 , 10000 5個個數
	
}
}
