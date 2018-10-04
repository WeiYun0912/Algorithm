package Algorithm;
import java.util.Scanner;

public class Sieve {
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.print("�п�Jn:");
	   int n = sc.nextInt();
	   Sieve_prime(n);
	   
   }
   static  void  Sieve_prime(int n) {
	     int j = 0;
	     int p = 0;
	     int A[] = new int[n];
	     int L[] = new int[n];
	     for(p = 2;p<n;p++) {
	    	 A[p] = p;
	     }
	     
	     //EX: n = 25
	     for(p = 2;p<Math.sqrt(n);p++) { // �d�� 2~n���}�ڸ�
	    	if(A[p] != 0) { //p������0��  �S���Q���h
	    		j = p*p; //p������ if p = 2 j=4,6,8,10.... and so on
	    		System.out.println(j);
	    		while (j<=n){ // �̤j�Ƥp��̫�@�ӼХX����ƪ�����
	    			A[j] = 0; // �N���O��� ��i0
	    			j = j+p;  // 6 8 10 12 14 16 18 20 22 24
	    			//System.out.println(j);
	    		}
	    	}
	     }
	     	
	     int i = 0;
	     for(p = 2;p<n;p++) {
	    	 if(A[p] != 0 ) {
	    		 L[i] = A[p];
	    		 i+=1;
	    	 }
	     }
	     
	     
	     System.out.print("A�}�C���G");
	     
	     for(p=0;p<A.length;p++) {
	    	 System.out.print(A[p]+" ");
	     }
	     
	     System.out.println("");
	     
	     System.out.print("L�}�C���G");
	     
	     for(p=0;p<L.length;p++) {
	    	 System.out.print(L[p]+" ");
	     }
	     
	     System.out.println();
	     
	     System.out.print(n+" ����Ƭ��G");
	     int count = 0;
	     for(p=0;p<L.length;p++) {
	    	 if(L[p] > 0 ) {
	    		 System.out.print(L[p]+" ");
	    		 count++;
	    	 }
	     }
	     System.out.println();
	     System.out.println(n+" �@�� :"+count+"�ӽ��");
//		return L;
	   
   }
}
