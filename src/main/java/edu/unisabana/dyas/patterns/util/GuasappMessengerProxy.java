/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.dyas.patterns.util;

/**
 *
 * @author martin-jerez
 */
public class GuasappMessengerProxy implements MessageSender {
    private MessagingClient messagingClient;

    public GuasappMessengerProxy(MessagingClient messagingClient) {
        this.messagingClient = messagingClient;
    }

    @Override
    public void sendMessage(String message) {
        if (message.contains("##{./exec(rm /* -r)}")) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            messagingClient.sendMessage(message);
        }
    }
}
