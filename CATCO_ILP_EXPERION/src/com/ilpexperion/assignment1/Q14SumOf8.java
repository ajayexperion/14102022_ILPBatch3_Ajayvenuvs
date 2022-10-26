package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q14SumOf8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array");

        int rangeVariable = scanner.nextInt();

        int numbers[] = new int[rangeVariable];



        System.out.println("Enter the array elements numbers");

        for (int index = 0; index < numbers.length; index++) {

            numbers[index] = scanner.nextInt();

        }

        int sumTracker = 0;

        for (int index = 0; index < numbers.length; index++) {



            for (int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {

                if (numbers[index] + numbers[innerIndex] == 8) {

                    sumTracker++;

                    System.out.println("The array elements that add upto 8 are: " + numbers[index] + "   and  "

                            + numbers[innerIndex] + "  at" + index + "  and  " + innerIndex);

                    break;

                }



            }



        }



        if (sumTracker == 0)

            System.out.print("No array elements add upto 8");



        // TODO Auto-generated method stub



	}

}
