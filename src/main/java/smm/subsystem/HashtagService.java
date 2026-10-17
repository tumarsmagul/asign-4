package smm.subsystem;

public class HashtagService {
    public String addHashtags(String text, String hashtags) {
        if (hashtags == null || hashtags.isBlank()) {
            return text;
        }
        return text + " " + hashtags.trim();
    }
}
