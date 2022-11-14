
public class SquareInteger {
	public static void main(String[] args) {
		int a = 11; 
		int b = 17;
		
		for(int i = a; i < b; i ++) {
			int sqrt = (int) Math.sqrt(i);
			if(sqrt*sqrt == i) {
				System.out.println(i);
			}
		}
	}
	
}
