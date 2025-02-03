package day7;

import javax.swing.*;
import java.awt.*;

public class PanelExample {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Panel Example");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBorder(BorderFactory.createTitledBorder("패널 1"));
        panel1.add(new JButton("버튼 1-1"));
        panel1.add(new JButton("버튼 1-2"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBorder(BorderFactory.createTitledBorder("패널 2"));
        panel2.add(new JButton("버튼 2-1"));
        panel2.add(new JButton("버튼 2-2"));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
