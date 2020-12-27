import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    JFrame frame = new JFrame("First Title");
    ImageIcon image = new ImageIcon("C:\\Users\\RyanPC\\OneDrive\\Documents\\JavaProjects\\Chess\\src\\KingSymbol.png"); //added image icon
    JLabel label = new JLabel();
    JPanel[][] panels = new JPanel[8][8];


    public Test() {
        //Image icon
        frame.setIconImage(image.getImage());

        //Label params
        //label.setText("Merry Christmas");

        for (int row = 0; row < panels.length; row++) {
            for (int column = 0; column < panels[row].length; column++) {
                panels[row][column] = new JPanel();
                panels[row][column].setBounds(50 * row, 50 * column, 50, 50);
                if (row % 2 == 0) {
                    panels[row][column].setBackground(Color.red);
                    if (column % 2 == 1)
                        panels[row][column].setBackground(Color.CYAN);
                }

                else
                    panels[row][column].setBackground(Color.CYAN);
            }
        }

//        panels[0][0] = new JPanel();
//        panels[0][1] = new JPanel();
//        panels[0][0].setBounds(0, 0 , 50, 50);
//        panels[0][0].setBackground(Color.BLACK);
//        panels[0][1].setBounds(50, 0 , 50, 50);
//        panels[0][1].setBackground(Color.RED);


        //frame
        frame.setVisible(true);
        frame.setSize(750, 750);
        frame.setLayout(null);
        //frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the application when you hit X
        //frame.add(label);
        for (int row = 0; row < panels.length; row++) {
            for (int column = 0; column < panels[row].length; column++) {
                frame.add(panels[row][column]);
            }
        }

    }
}
