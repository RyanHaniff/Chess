import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    JFrame frame = new JFrame("Chess");
    ImageIcon image = new ImageIcon("C:\\Users\\RyanPC\\OneDrive\\Documents\\JavaProjects\\Chess\\src\\KingSymbol.png"); //added image icon
    JLabel label = new JLabel();
    JPanel[][] panels = new JPanel[8][8];


    public Test() {
        //Image icon
        frame.setIconImage(image.getImage());

        for (int row = 0; row < panels.length; row++) {
            for (int column = 0; column < panels[row].length; column++) {
                panels[row][column] = new JPanel();
                panels[row][column].setBounds(50 * row, 50 * column, 50, 50);
                if (row % 2 == 0 && column % 2 == 0) { //set red for even panels
                        panels[row][column].setBackground(Color.black);
                } else if (row % 2 == 1 && column % 2 == 0)
                        panels[row][column].setBackground(Color.white);
                else if (row % 2 == 0 && column % 2 == 1)
                    panels[row][column].setBackground(Color.white);
                else if (row % 2 == 1 && column % 2 == 1)
                    panels[row][column].setBackground(Color.black);
                //we now have to start with cyan
            }
        }


        //frame
        frame.setVisible(true);
        frame.setSize(450, 450);
        frame.setLayout(null);
        //frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the application when you hit X
        for (int row = 0; row < panels.length; row++) {
            for (int column = 0; column < panels[row].length; column++) {
                frame.add(panels[row][column]);
            }
        }

    }
}
