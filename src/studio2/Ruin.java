package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		//variables
		Scanner in = new Scanner(System.in);
		System.out.println("How much money did you start with?");
		int startAmount = in.nextInt();

		System.out.println("What is the probability that you win?");
		double winChance = in.nextDouble();

		System.out.println("What is your win limit/goal?");
		int winLimit = in.nextInt();

		System.out.println("How many days will you play?");
		int totalSimulations = in.nextInt();

		//int currentMoney = 0;

		//code starts

		for (int i=0 ; i<totalSimulations; i++)
		{
			int currentMoney = startAmount;
			while (startAmount > 0 && startAmount < winLimit)
			{
				
				double x = Math.random() ;
				if (x < winChance )
				{
					startAmount++ ;
					System.out.println("Current Money: $" + currentMoney);
				}
				if (x > winChance )
				{
					startAmount-- ;
					System.out.println("Current Money: $" + startAmount);

				}

			}
			if (currentMoney == 0) {
				System.out.println("Ruin!");

			}
			if (currentMoney == winLimit) {
				//currentMoney = winLimit;
				System.out.println("Success!");

			}
		}



	}

}
