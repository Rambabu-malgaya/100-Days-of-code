import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawShapes extends JFrame {
  public DrawShapes() {
    setTitle("Draw Shapes");
    setSize(350, 250);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.RED);
    g.drawOval(50, 50, 100, 100);
    g.setColor(Color.BLUE);
    g.drawLine(50, 50, 150, 150);
  }

  public static void main(String[] args) {
    new DrawShapes();
  }
}
