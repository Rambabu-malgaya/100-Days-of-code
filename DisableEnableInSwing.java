
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class DisableEnableInSwing extends JFrame {
    public static final String ENABLE = "ENABLE";
    public static final String DISABLE = "DISABLE";
    private JToolBar toolBar = new JToolBar();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu testMenu = new JMenu("Test");
    private MyAction theAction = new MyAction(this);
    private JMenuItem disableActionItem = new JMenuItem("Disable the Action");

    public DisableEnableInSwing() {
        this.setJMenuBar(menuBar);
        menuBar.add(testMenu);
        testMenu.add(theAction);
        toolBar.add(theAction);
        disableActionItem.setActionCommand(DISABLE);
        testMenu.add(disableActionItem);
        disableActionItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(DISABLE)) {
                    theAction.setEnabled(false);
                    disableActionItem.setText("Enable the Action");
                    disableActionItem.setActionCommand(ENABLE);
                } else {
                    theAction.setEnabled(true);
                    disableActionItem.setText("Disable the Action");
                    disableActionItem.setActionCommand(DISABLE);
                }
            }
        });
        this.getContentPane().add(toolBar, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.red);
        this.setSize(320, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        DisableEnableInSwing t = new DisableEnableInSwing();
    }
}

class MyAction extends AbstractAction {
    JFrame f;
    boolean toggle = true;

    public MyAction(JFrame f) {
        super("Change Color");
        this.f = f;
    }

    public void actionPerformed(ActionEvent e) {
        if (toggle) {
            f.getContentPane().setBackground(Color.blue);
            toggle = false;
        } else {
            f.getContentPane().setBackground(Color.red);
            toggle = true;
        }
    }
}
