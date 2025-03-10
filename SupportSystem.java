import java.util.HashSet;
import java.util.Scanner;

/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class SupportSystem
{
    /*
     * 2. 
     * 3. The other one has an int toffset parameter and the other doesnt. 
     * 4. endsWith(String suffix)
     * 5. length() 
     * 6. Because they are aligned in the String class documentation
     * 7. Returns a string, with all leading and trailing space removed. 
     * 10. boolean
     * 11. startsWith change to equals
     * 12. It is in the java.util package; 
     * 15. The random numbers will return from 0-99
     * 23. yes because in the method, we used .size which automatically updates when a new list has been added.
     * 24. A HashMap constructs an empty HashMap with the default initial capacity (16) and the default loader factor (0.75)
     * 25. get, put, remove, containsKey
     * 26. isEmpty
     * 28. Updates/overwrites the old values
     * 29. Updates/overwrites the old values
     * 30. 
     * 31. It just results as "null"
     * 32. contacts.getkeySet() 
     * 
     */
    
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            HashSet<String> input = reader.getInput();
            // 
            // input = input.trim(); // #8
            // input = input.toLowerCase(); // #9
            
            if(input.contains("bye"))  { 
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }
    
    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
