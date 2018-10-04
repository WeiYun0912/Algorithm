package Algorithm;

public class Seqsearch {
	public static void main(String[]argv) {
		int array[] = {1,2,3,4,10}; 
		
		seqsearch(array.length,array,10,0);
		
	}
		static void seqsearch(int n , int array[],int x,int location) {
			location = 0;
			while(location <= n && array[location] != x) {
				location++;
				if(location > n) { //長度超過 代表找不到
					location = 0;
				}
			}
			
			System.out.println(location);
			
		}
}
