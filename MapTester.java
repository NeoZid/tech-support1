import java.util.HashMap;
/*
 * 24. 
 * 25. 
 * 26. 
 * 28. Updates/overwrites the old values
 * 29. Updates/overwrites the old values
 * 30. 
 * 31. It just results as "null"
 * 32. contacts.getkeySet()
 * 
 */

public class MapTester
{
    private HashMap<String,String> contacts; 
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        contacts = new HashMap<>();
        fillContacts();
    }
    
    private void fillContacts(){
        contacts.put("john","321123");
        contacts.put("john1","374123");
        contacts.put("john2","372193");
    }
    
    // #27
    public void enterNumber(String name, String number)
    {
        contacts.put(name,number);
    }
    
    public String lookupNumber(String name)
    {
        return contacts.get(name);
    }
}
