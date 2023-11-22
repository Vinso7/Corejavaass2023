package Javacoreass;

public class ArmstrongQ2 {

	public ArmstrongQ2() {
		// TODO Auto-generated constructor stub
	}


		// TODO Auto-generated method stub
		

		

			public static void main(String[] args) {
				
				int temp, last;
				int sum;
				System.out.println("The Armstrong Number falling in the range of 100-999 are as follows:");
				for (int i = 100; i <= 999; i++) {
					temp=i;
					sum=0;
					while (temp!= 0) {
						last=temp%10;
						sum += (last * last * last);
						temp /=10;
		 
					}
					if (sum == 1) {
						System.out.println(i);
						
					}
				}

		

		
	}

}
