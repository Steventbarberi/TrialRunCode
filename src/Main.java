package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 100. To exit, enter -1.");
		int i = sc.nextInt();
		int sum = 0;
		int numInt = 0;

		while(i != -1){
			if( i < -1){
				System.out.println("ERROR: please enter a value between 0 and 100 or enter -1 to calculate or average.");
			}
			else if( i > 100) {
				System.out.println("ERROR: please enter a value between 0 and 100 or enter -1 to calculate or average.");
			}
			else {
				sum = sum + i;
				numInt += 1;
			}
			i = sc.nextInt();
		}
		int Avg;
		Avg = sum/numInt;
		System.out.println(Avg);


    }
}
