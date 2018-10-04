package Algorithm;

public class MaxElement {
public static void main(String[]argv) {
	int SearchMax[] = {500,200,300,400,1000};
	int Max = SearchMax[0];
	for(int i=0;i<SearchMax.length;i++) {
		if(SearchMax[i] > Max) {
			Max = SearchMax[i];
		}
	}
	
	System.out.println(Max);
}
}
