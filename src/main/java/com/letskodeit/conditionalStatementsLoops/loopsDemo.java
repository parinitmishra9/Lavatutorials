package com.letskodeit.conditionalStatementsLoops;

/**
 * Created by @author parinitmishra on 5/9/2020
 */
public class loopsDemo {

    public static void main(String[] args) {

		/*for (int i = 0; i < 10; i++) {
			System.out.println("The value of i: " + i);
		}*/

        int[] numbers = {10, 20, 30};
		/*for (int i = 0; i < numbers.length; i++) {
			System.out.println("The value of index " + i + " is: " + numbers[i]);
		}*/

        for (int number: numbers) {
            System.out.println("The value is: " + number);

        }

        String[] cars = {"bmw", "audi", "honda"};
        for (String car: cars) {
            System.out.println(car);
        }
    }

}
