public class prime {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            int reminder = i % 2;
            if (reminder == 1) {
                for (int j = 2; j < 9; j++) {
                    // int rem = i % j;
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                        // System.out.println(isPrime + "Not prime Number");
                    }
                }
                if (isPrime == true)
                    System.out.println("Prime Number " + isPrime + i);
            }

            // if (reminder == 1) {
            // int number = i;
            // while (d < 9) {
            // int rem = number % d;

            // if (rem == 0) {
            // System.out.println("Number is not prime");
            // } else
            // System.out.println("Prime Number");
            // }

            // }
            // System.out.println(i);
        }
    }
}
