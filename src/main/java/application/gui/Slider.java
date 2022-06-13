package application.gui;

import javax.swing.*;

public class Slider extends JPanel
{
    private final String title;
    private float variable;
    private final JLabel label;
    private final JSlider slider;

    public Slider(String title, float variable, int min, int max, int value)
    {
        this.title = title;
        this.variable = variable;

        label = new JLabel(title + ": " + variable);
        slider = new JSlider(min, max, value);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        initGUI();
    }

    public float getVariable()
    {
        return variable;
    }

    private void initGUI()
    {
        this.add(label);
        this.add(slider);
        slider.addChangeListener(e -> action());
    }

    private void action()
    {
        variable = slider.getValue();
        label.setText(title + ": " + variable);
    }
}