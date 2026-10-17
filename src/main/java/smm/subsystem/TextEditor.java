package smm.subsystem;

public class TextEditor {
    public String prepare(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Post text cannot be empty");
        }
        return text.trim();
    }
}
