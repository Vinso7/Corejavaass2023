package Javacoreass;

import java.util.Scanner;

public class Armstrongnumber {

	public Armstrongnumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int a= num, r=0, result=0;
		while(a!=0) {
			r=a%10;
			a=a/10;
			result=result + r*r*r;
		}
		if(result ==num) {
			System.out.println("this is an armstrong :" + num);
		}
		else {
			System.out.println("This is not an armstrong number :" +num);
		}

 
	}
 

	}


