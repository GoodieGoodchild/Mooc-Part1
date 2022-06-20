/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author jonat
 */
public class MessagingService {
    
    ArrayList<Message> messages;
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        // adds a message passed as a parameter to the messaging service 
        // as long as the message content is at most 280 characters long.
        
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
        
    }
    
    public ArrayList<Message> getMessages() {
        int collectionSize = 0;
        while (!messages.isEmpty()) {
            return messages;
        }
        
        
        return messages;
    }
    
}
