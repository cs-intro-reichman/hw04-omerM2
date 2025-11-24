public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
int maximumPrime = Integer.parseInt(args[0]);
        int primeCount = 0;

        System.out.println("Prime numbers up to " + maximumPrime + ":");

        for (int i = 2; i <= maximumPrime; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {  
                    isPrime = false;
                    break;           
                }
            }

            if (isPrime) {
                primeCount++;
                System.out.println(i);
            }
        }

        int percent = (int) Math.round(100.0 * primeCount / maximumPrime);

        System.out.println("There are " + primeCount + " primes between 2 and " 
                           + maximumPrime + " (" + percent + "% are primes)");
    }
}