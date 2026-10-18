package smm.facade;

import smm.subsystem.HashtagService;
import smm.subsystem.ImageService;
import smm.subsystem.PostService;
import smm.subsystem.TextEditor;
import smm.subsystem.TimeService;

public class SmmFacade {
    private final TextEditor textEditor = new TextEditor();
    private final HashtagService hashtagService = new HashtagService();
    private final ImageService imageService = new ImageService();
    private final TimeService timeService = new TimeService();
    private final PostService postService = new PostService();

    public void publishPost(String text, String hashtags, String platform, String time) {
        String readyText = textEditor.prepare(text);
        readyText = hashtagService.addHashtags(readyText, hashtags);
        String image = imageService.prepareImage("dessert.jpg", platform);
        String readyTime = timeService.checkTime(time);
        postService.publish(platform, readyText, image, readyTime);
    }
}
