public class Character {
    private char value;
    private String font;
    private int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void render(int x, int y) {
        System.out.printf("Rendering '%c' at (%d, %d) with font '%s' and size %d.%n", value, x, y, font, size);
    }
}
