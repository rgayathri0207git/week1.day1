package week1.day1;

public class Fibanocci {

	public static void main(String[] args) {

		int N=11;
		int firstNum=0;
		int secondNum=1;
		int sum=0;
		System.out.print(firstNum+" "+secondNum+" ");
		for (int i =2;i<N; i++) {
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.print(sum+ " ");
		

		}
	}

}
