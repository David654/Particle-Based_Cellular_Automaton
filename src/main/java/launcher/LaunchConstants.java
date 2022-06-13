package launcher;

import java.awt.*;

public class LaunchConstants
{
    private static final Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int width = d.width / 2;
    public static final int height = d.height / 2;

    public static final int tickRate = 60;
    public static final boolean vsync = false;

    public static final String title = "Particle-Based Cellular Automaton";
}