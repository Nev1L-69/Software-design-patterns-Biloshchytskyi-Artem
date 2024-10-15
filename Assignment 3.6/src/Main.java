public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();


        String sampleText = "Hello Flyweight Pattern! ";
        for (int i = 0; i < 10; i++) {
            textEditor.insertText(sampleText, "Arial", 12);
        }


        System.out.println("Rendering text:");
        textEditor.render();
    }
}
