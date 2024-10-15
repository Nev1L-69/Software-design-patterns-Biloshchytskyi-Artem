import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private CharacterFactory characterFactory = new CharacterFactory();
    private List<Character> characters = new ArrayList<>();

    public void insertText(String text, String font, int size) {
        for (char c : text.toCharArray()) {
            Character character = characterFactory.getCharacter(c, font, size);
            characters.add(character);
        }
    }

    public void render() {
        int x = 0;
        int y = 0;
        for (Character character : characters) {
            character.render(x, y);
            x += 10;
        }
    }
}
