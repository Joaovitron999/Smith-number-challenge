/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsmithnumberchallenge;

/**
 *
 * @author 2020.1.08.003
 */
public class PrimeNumbers {
        
        public static boolean isPrime(int number){
            if(number == 1){
                return false;
            }
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    return false;
                }
            }
            return true;
        }
        
        public static int sumOfDigits(int number){
            int sum = 0;
            while(number > 0){
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }

        public static String sumOfDigitsToString(int number){
            String s = "[";
            String numberString = Integer.toString(number);
            for(int i = 0; i < numberString.length(); i++){
                s += numberString.charAt(i);
                if(i < numberString.length() - 1){
                    s += " + ";
                }
            }
            s += "] = " + sumOfDigits(number);
            return s;
        }
        
        public static int sumOfPrimeFactors(int number){
            int[] primeFactors = new int[100];
            primeFactors = primeFactors(number);
            int sum = 0;
            for(int i = 0; i < primeFactors.length; i++){
                sum += sumOfDigits(primeFactors[i]);
            }
            return sum;
        }

        public static int[] primeFactors(int number){
            int[] primeFactors = new int[100];
            int index = 0;
            for(int i = 2; i <= number; i++){
                if(number % i == 0 && isPrime(i)){
                    primeFactors[index] = i;
                    index++;

                    number /= i;
                    i = 1;
                }
            }
            return primeFactors;
        }

        public static String primeFactorsToString(int number){
            String s = "[";
            int[] primeFactors = primeFactors(number);
            for(int i = 0; i < primeFactors.length; i++){
                if(primeFactors[i] != 0){
                    s += primeFactors[i];
                    if(i < primeFactors.length - 1 && primeFactors[i + 1] != 0){
                        s += " + ";
                    }
                }
            }
            s += "] = " + sumOfPrimeFactors(number);
            
            return s;
        }
        
        public static boolean isSmithNumber(int number){
            return (sumOfDigits(number) == sumOfPrimeFactors(number) && !isPrime(number));
        }
        
    

}
