package org.fasttrack.tema8;

public class PrintAdvertisement implements Advertisement{
    private String content;

    public PrintAdvertisement(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("Printing advertisement:" + content);
    }
}
