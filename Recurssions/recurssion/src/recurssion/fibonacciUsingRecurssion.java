package recurssion;

public class fibonacciUsingRecurssion {
static int fibonacci(int n) {
	if(n==0||n==1) {
		return n;
	}
	else {
		return fibonacci(n-2)+fibonacci(n-1);
	}
}
	public static void main(String[] args) {
		int num=9;
		System.out.print(fibonacci(num));

	}

}
