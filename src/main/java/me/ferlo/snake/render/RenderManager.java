package me.ferlo.snake.render;

public interface RenderManager {

    void startRendering();

    void showDialog(String title, String message,
                    String yesButton, String noButton,
                    Runnable onYes, Runnable onNo);

    <T> Renderer<T> getRendererFor(Class<T> type);
}
