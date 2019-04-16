/*
 * @author: Mark Berney
 * @version: 1.0
 */

import javax.swing.*;
import java.awt.*;

public class MainUI {
    public MainUI() {
        GUI();
    }

    public void GUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MainUI main = new MainUI();
    }
}
