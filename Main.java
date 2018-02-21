import graphics.Window;

public class Main {
    private boolean isRunning, isPaused;
    Window window;

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    private void init() {
        isRunning = true;
        isPaused = false;

        window = new Window("Project", 960, 540);
    }
}
