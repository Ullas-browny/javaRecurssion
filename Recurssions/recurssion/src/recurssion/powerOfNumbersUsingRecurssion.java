package recurssion;

/*|----------------------------------------------|
  |this is for both negative and positive numbers|
  |----------------------------------------------|*/

public class powerOfNumbersUsingRecurssion {
	
static int calc(int base,int power) {
	
	if(power==0) {
		return 1; 
	}
	else {
		
		return base*calc(base,power-1);
	}
	
}
	public static void main(String[] args) {
		int base=2;
		int power=3;
		
		
		if(power<0) {
		int pow=-1*power;
		System.out.print((double)1/calc(base,pow));
		}
		else {
		System.out.print(calc(base,power));	
		}
		
		
	}

}
