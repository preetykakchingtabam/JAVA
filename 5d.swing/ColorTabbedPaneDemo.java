package swing5d;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Tabbed Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.addTab("Cyan", cyanPanel);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.addTab("Magenta", magentaPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.addTab("Yellow", yellowPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
