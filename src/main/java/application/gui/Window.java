package application.gui;

import application.ApplicationConstants;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
{
    public Window(int width, int height, String title)
    {
        this.setSize(width, height);
        this.setResizable(false);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);

        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        initGUI();
    }

    public void open()
    {
        this.setVisible(true);
    }

    private void initGUI()
    {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.setLayout(new GridLayout(2, 1));
        panel2.setLayout(new GridLayout(2, 1));
        panel3.setLayout(new GridLayout(2, 1));

        JLabel label1 = new JLabel("Simulations Per Frame: " + ApplicationConstants.simulationsPerFrame);
        JLabel label2 = new JLabel("Particle Radius: " + ApplicationConstants.particleRadius);
        JLabel label3 = new JLabel("Particle Count: " + ApplicationConstants.particleCount);

        JSlider slider1 = new JSlider(1, 100, ApplicationConstants.simulationsPerFrame);
        JSlider slider2 = new JSlider(1, 10, (int) ApplicationConstants.particleRadius);
        JSlider slider3 = new JSlider(10, 1000, ApplicationConstants.particleCount);

        slider1.addChangeListener(e ->
        {
            ApplicationConstants.simulationsPerFrame = slider1.getValue();
            label1.setText("Simulations Per Frame: " + ApplicationConstants.simulationsPerFrame);
        });

        slider2.addChangeListener(e ->
        {
            ApplicationConstants.particleRadius = slider2.getValue();
            label2.setText("Particle Radius: " + ApplicationConstants.particleRadius);
        });

        slider3.addChangeListener(e ->
        {
            ApplicationConstants.particleCount = slider3.getValue();
            label3.setText("Particle Count: " + ApplicationConstants.particleCount);
        });

        panel1.add(label1);
        panel1.add(slider1);

        panel2.add(label2);
        panel2.add(slider2);

        panel3.add(label3);
        panel3.add(slider3);

        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
    }
}