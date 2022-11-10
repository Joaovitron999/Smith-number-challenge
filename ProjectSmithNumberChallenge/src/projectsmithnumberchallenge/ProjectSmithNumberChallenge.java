/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsmithnumberchallenge;

import java.util.Scanner;

/**
 *
 * @author 2020.1.08.003
 */
public class ProjectSmithNumberChallenge {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        

        //first 1000 smith numbers
        for(int i = 1; i < 100; i++){
            if(PrimeNumbers.sumOfDigits(i) == PrimeNumbers.sumOfPrimeFactors(i)){
                System.out.println("["+ i +"] -  is a Smith Number");
            }   
        }
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();


        while(number!=0){
            if(PrimeNumbers.isSmithNumber(number)){
            System.out.println(number + " is a Smith number.");
            System.out.println("The sum of the digits of " + number + " is " + PrimeNumbers.sumOfDigitsToString(number) + ".");
            System.out.println("The sum of the digits of the prime factors of " + number + " is " + PrimeNumbers.primeFactorsToString(number) + ".");

            }
            else{
                System.out.println(number + " is not a Smith number.");
                System.out.println("The sum of the digits of " + number + " is " + PrimeNumbers.sumOfDigitsToString(number));
                System.out.println("The sum of the digits of the prime factors of " + number + " is " + PrimeNumbers.primeFactorsToString(number) + ".");
            }

            System.out.println("Enter a number: ");
            number = input.nextInt();
        }

        



        
        






    }
    
}
