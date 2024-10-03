// UI Components
public interface Button {
    void render();
}

class DarkThemeButton implements Button {
    public void render() {
        System.out.println("Rendering Dark Theme Button");
    }
}

class LightThemeButton implements Button {
    public void render() {
        System.out.println("Rendering Light Theme Button");
    }
}

// Abstract Factory
interface UIFactory {
    Button createButton();
}

class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }
}

class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }
}
