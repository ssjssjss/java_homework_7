package ssj_7;

import java.util.Scanner;

public class Pack_11_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int[][] numbers=new int[100][12];
		for(i=0;i<100;i++) {
			for(j=0;j<12;j++)
				numbers[i][j]=0;
		}
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of objects: ");
		int number=input.nextInt();
		System.out.print("Enter the weights of the objects: ");
		for(i=0;i<number;i++) {
			int m=input.nextInt();
			for(j=1;j<100;j++) {
				if(numbers[j][0]+m<=10) {
					numbers[j][++numbers[j][11]]=m;
					numbers[j][0]+=m;
					break;
				}
			}
		}
		for(i=1;i<100;i++) {
			if(numbers[i][0]!=0) {
				System.out.print("Container "+i+" contains objects with weight ");
				for(j=1;j<11&&numbers[i][j]!=0;j++) {
					System.out.print(numbers[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}

}
