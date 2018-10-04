package Algorithm;

public class BinarySearch {
public static void main(String[]argv) {
	int array [] = {10,20,30,40};
	
	binsearch(array.length-1,array,40,0);
}
	static void binsearch(int n , int array[] , int target , int index) {
		int low,mid,high;
		low = 1;
		high = n;
		index = 0;
		
		while(low <= high ) {
			mid = (low+high)/2;
			if(array[mid] == target) {
				index = mid;
				break;
			}else if(target < array[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		System.out.println(target+" 在陣列索引值 ["+index+"] 的位置");
		
	}
}
