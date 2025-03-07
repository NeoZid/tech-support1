import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 */
public class RandomTester
{
    private Random rand_gen;
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("no idea");
        responses.add("idk bruh");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    // #14a
    public void printRandom()
    {
        System.out.println("New integer:" + rand_gen.nextInt(1000));
    }
    // #14b
    public void printMultiRandom(int howMany)
    {
        int count = 0;
        while (count < howMany){
            count++;
            System.out.println("New integers:"+ rand_gen.nextInt());
        }
    }
    // #16
    public void throwDice(){
        System.out.println("You rolled a: " + (rand_gen.nextInt(6)+1));
    }
    
    // #17
    
    public String getResponse(){
        int choice = rand_gen.nextInt(3);
        
        if (choice == 0) {
            return "yes";
        } else if (choice == 1) {
            return "no";
        } else {
            return "maybe";
        }
        }
    
    // #18 
    
    public String getResponseArray(){
        int choice = rand_gen.nextInt(responses.size());
        return responses.get(choice);
    }
    
    // #19
    public void generateMax(int max){
        System.out.println(rand_gen.nextInt(max)+1);
    }
    
    // #20
    public void generateMinMax(int min, int max){
        System.out.println(rand_gen.nextInt(max-min)+1);
    }
}
