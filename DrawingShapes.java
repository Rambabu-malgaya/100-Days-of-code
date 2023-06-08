import javax.swing.*;
import java.awt.*;

public class DrawingShapes extends JFrame {

    public DrawingShapes() {
        setTitle("Drawing Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JButton circleButton = new JButton("Draw Circle");
        circleButton.addActionListener(e -> {
            Graphics g = panel.getGraphics();
            g.setColor(Color.RED);
            g.drawOval(50, 50, 100, 100);
        });
        panel.add(circleButton);

        JButton waveformButton = new JButton("Draw Waveform");
        waveformButton.addActionListener(e -> {
            Graphics g = panel.getGraphics();
            g.setColor(Color.BLUE);
            int[] xPoints = { 100, 150, 200, 250, 300, 350, 400 };
            int[] yPoints = { 150, 100, 150, 100, 150, 100, 150 };
            g.drawPolyline(xPoints, yPoints, 7);
        });
        panel.add(waveformButton);

        JCheckBox enableButton = new JCheckBox("Enable Drawing");
        enableButton.addActionListener(e -> {
            circleButton.setEnabled(enableButton.isSelected());
            waveformButton.setEnabled(enableButton.isSelected());
        });
        panel.add(enableButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> {
            Graphics g = panel.getGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, panel.getWidth(), panel.getHeight());
        });
        panel.add(clearButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawingShapes();
    }
}
