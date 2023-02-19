package recurssion;

public class countDownRecurssion {
	static void count(int n1,int n2) {
		
	
		if(n1==n2){
			System.out.print(n1);
		}
		else {
			System.out.print(n1+" ");
			count(n1-1,n2);
		}
	
	}
		public static void main(String[] args) {
			int startingNum=48;
			int endingNum=24;
			if(startingNum<=endingNum) {
				System.out.print("provide correct values");
			}
			else {
			count(startingNum,endingNum);
			}
		

	}

}
