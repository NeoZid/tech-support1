import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

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
    private HashMap<String,String> responsesMap;
    private Random rand_gen;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        responsesMap = new HashMap<>();
        fillResponses();
        fillResponsesMap();
    }
    
    private void fillResponses(){
        responses.add("Is that so? Tell me more");
        responses.add("I see, would you mind explaining more?");
        responses.add("I understand, please do tell me more");
        responses.add("I get that, what happened?");
        responses.add("ayo wassup cuh");
    }
    // #3
    private void fillResponsesMap(){
        responsesMap.put("whats up lil bro","you got some mcdonalds");
        responsesMap.put("asdasdsa","374123");
        responsesMap.put("what is this","supposed to be");
    
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateOldResponse()
    {
        int choice = rand_gen.nextInt(responses.size());
        return responses.get(choice);
    }
    
    public String generateResponse(HashSet<String> word)
    {
        String answer = responsesMap.get(word);
            if (answer==null) {
            answer = pickDefaultResponse(); 
        }
        return answer;
    }
    // #33
    public String pickDefaultResponse(){
        return "I seem to have a problem responding, do you mind re-explaining?";
    }
}
