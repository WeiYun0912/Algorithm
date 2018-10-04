package Algorithm;

public class Exchange {
public static void main(String[]argv) {
	int array[] = {10,1,5,6,15};
	exchangesort(array.length-1,array);
}
	static void exchangesort(int n , int array[]) {
		int i,j;
		for(i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				
				if(array[j] < array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
					
				}
			
			}
			
		}
		
		for(i=0;i<array.length;i++) {
			System.out.print(array[i]+" , ");
		}
		
		
		
	}
}
