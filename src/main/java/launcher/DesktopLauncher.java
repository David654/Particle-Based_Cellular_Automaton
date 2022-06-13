package launcher;

import application.gui.Window;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;

public class DesktopLauncher
{
    public static void main(String[] args)
    {
        FlatLightLaf.setup();

        Window window = new Window(400, 600, "Settings");
        window.open();

        Lwjgl3ApplicationConfiguration config = new  Lwjgl3ApplicationConfiguration();

        config.setIdleFPS(LaunchConstants.tickRate);
        config.useVsync(LaunchConstants.vsync);
        config.setWindowedMode(LaunchConstants.width, LaunchConstants.height);
        config.setTitle(LaunchConstants.title);
        config.setBackBufferConfig(1, 1, 1, 1, 0, 0, 8);

        new Lwjgl3Application(new Boot(), config);
    }
}