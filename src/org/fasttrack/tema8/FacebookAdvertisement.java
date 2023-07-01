package org.fasttrack.tema8;

public class FacebookAdvertisement implements Advertisement {
    private String content;

    public FacebookAdvertisement(String content) {
        this. content = content;
    }

    public void display() {
        System.out.println("Displaying Facebook advertisement " + content);
    }
}
