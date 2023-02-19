package recurssion;
public class sumOfGivenNumberUsingRecurssion {
	
	static int sum(int n) {
		if(n==0||n==1) {
			return n;
		}
		else {
			return n%10+sum(n/10);
			
		}
			
	}
	public static void main(String[] args) {
		int num=1555;
		System.out.print(sum(num));

	}

}
