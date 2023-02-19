package recurssion;

public class stringReverseUsingRecurssion {
static void stringReverse(String s,int index) {
	
	
	if(index==0) {
		System.out.print(s.charAt(index));
	}
	else {
		System.out.print(s.charAt(index));
		stringReverse(s,index-1);
	}

}
	public static void main(String[] args) {
		String str="Reverse Me";
		stringReverse(str,str.length()-1);
				

	}

}
