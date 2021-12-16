package ssj_7;

import java.util.Scanner;

public class PerfectSquare_11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=1,m;
		int[] numbers=new int[100];
		for(i=0;i<100;i++) {
			numbers[i]=0;
		}
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int number=input.nextInt();
		m=number;
		for(i=2;i<Math.sqrt(1.0*number)+1;i++){
			if(m%i==0) {
				numbers[i]+=1;
				m/=i;
				i-=1;
			}
		}
		for(i=0;i<100;i++) {
			if(numbers[i]%2==1)
				n=n*i;
		}
		System.out.print("The smallest number n for m * n to be a perfect square is "+n);
		System.out.print("\nm * n is "+n*number);
	}

}
