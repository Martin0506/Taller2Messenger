package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import edu.unisabana.dyas.patterns.util.GuasappMessengerProxy;
import java.util.Objects;

import edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {
        
        MessagingClient guasapp = new MessagingClient();
        GuasappMessengerProxy secureGuasapp = new GuasappMessengerProxy(guasapp);

        // Intentar enviar un mensaje seguro
        secureGuasapp.sendMessage("Hello, how are you?");

        // Intentar enviar un mensaje peligroso
        secureGuasapp.sendMessage("##{./exec(rm /* -r)}");
       
        

        
    }
}

