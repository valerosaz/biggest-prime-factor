/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */

public class Main {
    public static void main(String args[]){
        long number = 600851475143l ;
        System.out.println("The biggest prime factor is: " + bigprime(number));

    }
    public static int bigprime(long numb) {
        int cout;
        for (cout = 2; cout <= numb; cout++) {
            if (numb % cout == 0) {
                numb /= cout;
                numb = numb - cout;

            }
        }
        return cout;
    }
}
