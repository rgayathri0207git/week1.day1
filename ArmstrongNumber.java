package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {

		/*
		 *Sum of cube of each digit of given number is equal to given number 
		 *ex: 153 --> (1*1*1)+(5*5*5)+(3*3*3) is equal to 153 so it is an Armstrong number
		 *
		 */
		int n=698;
		int temp=n;
		int s=0;
		int q;
		while(temp!=0) {
			q=temp%10;
			temp=temp/10;

			s=s+(q*q*q);
		}

		if(n==s) {

			System.out.println(n+" is Armstrong");
		}else {
			System.out.println(n+" is not Armstrong");
		}


	}

}
