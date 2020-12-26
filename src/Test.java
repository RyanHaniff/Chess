import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    JFrame frame = new JFrame("First Title");
    ImageIcon image = new ImageIcon("C:\\Users\\RyanPC\\OneDrive\\Documents\\JavaProjects\\Chess\\src\\KingSymbol.png"); //added image icon

    public Test () {
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(255, 0, 255));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the application when you hit X


        frame.setIconImage(image.getImage());

    }
}
