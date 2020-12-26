import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    JFrame frame = new JFrame("First Title");

    public Test () {
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(255, 0, 255));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
