package assignment5;

public class Number31 {
	
	public static void patternGen() {
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
	
	
public static void main(String[] args) {
	Number31.patternGen();
}
}
