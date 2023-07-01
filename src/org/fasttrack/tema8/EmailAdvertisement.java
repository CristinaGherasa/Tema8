package org.fasttrack.tema8;

public class EmailAdvertisement implements Advertisement{
    private String subject;
    private String content;
    private String recipient;

    public EmailAdvertisement(String subject, String content, String recipient) {
        this.subject = subject;
        this.content = content;
        this.recipient = recipient;
    }

    @Override
    public void display() {
        System.out.println("Sending Email advertisement to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Content: " + content);
    }
}
