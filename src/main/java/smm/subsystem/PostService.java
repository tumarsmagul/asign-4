package smm.subsystem;

public class PostService {
    public void publish(String platform, String text, String image, String time) {
        System.out.println("Post scheduled for " + platform);
        System.out.println(text);
        System.out.println(image);
        System.out.println("Time: " + time);
    }
}
