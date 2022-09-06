package week1.day1;

public class isPrime {

	public static void main(String[] args) {
		int n=59;
		boolean isPrime =true;
		for (int i = 2; i<=n/2; i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime==true) {
			System.out.println(n+" is Prime number");
		}else {
			System.out.println(n+" is not Prime number");
		}

	}

}
