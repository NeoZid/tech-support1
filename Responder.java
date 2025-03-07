import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private ArrayList<String> responses;
    private Random rand_gen;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        fillResponses();
    }
    
    private void fillResponses(){
        responses.add("Is that so? Tell me more");
        responses.add("I see, would you mind explaining more?");
        responses.add("I understand, please do tell me more");
        responses.add("I get that, what happened?");
        responses.add("ayo wassup cuh");
    }
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int choice = rand_gen.nextInt(responses.size());
        return responses.get(choice);
    }
    
    
}
