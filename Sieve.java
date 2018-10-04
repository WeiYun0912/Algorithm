package Algorithm;
import java.util.Scanner;

public class Sieve {
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.print("叫块n:");
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
	     for(p = 2;p<Math.sqrt(n);p++) { // 絛瞅 2~n秨腹
	    	if(A[p] != 0) { //pぃ单0  ⊿Τ砆
	    		j = p*p; //p计 if p = 2 j=4,6,8,10.... and so on
	    		System.out.println(j);
	    		while (j<=n){ // 程计程夹借计キよ
	    			A[j] = 0; // ぃ琌借计 峨秈0
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
	     
	     
	     System.out.print("A皚");
	     
	     for(p=0;p<A.length;p++) {
	    	 System.out.print(A[p]+" ");
	     }
	     
	     System.out.println("");
	     
	     System.out.print("L皚");
	     
	     for(p=0;p<L.length;p++) {
	    	 System.out.print(L[p]+" ");
	     }
	     
	     System.out.println();
	     
	     System.out.print(n+" 借计");
	     int count = 0;
	     for(p=0;p<L.length;p++) {
	    	 if(L[p] > 0 ) {
	    		 System.out.print(L[p]+" ");
	    		 count++;
	    	 }
	     }
	     System.out.println();
	     System.out.println(n+" Τ :"+count+"借计");
//		return L;
	   
   }
}
