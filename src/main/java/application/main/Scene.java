package application.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import launcher.LaunchConstants;
import org.lwjgl.opengl.GL20;

public class Scene extends ScreenAdapter
{
    public Scene()
    {

    }

    private void update()
    {
        Gdx.graphics.setTitle(LaunchConstants.title + " | FPS: " + Gdx.graphics.getFramesPerSecond());
    }

    public void render(float delta)
    {
        update();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}