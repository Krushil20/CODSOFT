package task1;

import java.util.Random;

public class _001_random {
    public static void main(String[] args) {
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(100);

        // Print random integers
        System.out.println("Random Integers: "+rand_int1);
    }
}
