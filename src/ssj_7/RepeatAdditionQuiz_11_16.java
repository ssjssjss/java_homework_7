package ssj_7;

import java.util.Scanner;

public class RepeatAdditionQuiz_11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		int[] answers=new int[100];
		int i=-1,j;
		Scanner input=new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+"? ");
		int answer=input.nextInt();
		answers[++i]=answer;
		while (number1+number2!=answer) {
			for(j=0;j<i;j++){
				if(answers[j]==answer) {
					System.out.print("You already entered "+answer+"\n");
					break;
				}
			}
			System.out.print("Wrong answer. Try again. What is "+number1+" + "+number2+"? ");
			answer=input.nextInt();
			i++;
		}
		System.out.print("You got it!");
	}

}
