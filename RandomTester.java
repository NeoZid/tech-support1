import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 */
public class RandomTester
{
    private Random rand_gen;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        rand_gen = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printRandom()
    {
        
        System.out.println("New integer:" + rand_gen.nextInt(1000));
    }
}
