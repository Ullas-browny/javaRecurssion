package recurssion;

public class sumOfNaturalNumbersUsingRecurssion {
static int sum(int n){
	if(n==0||n==1) {
		return n;
	}
	else {
		return n+sum(n-1);
	}
}
	public static void main(String[] args) {
		int num=6;
		System.out.print(sum(num));

	}

}
