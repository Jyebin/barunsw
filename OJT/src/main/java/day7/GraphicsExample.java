package day7;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsExample extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.GREEN);
		g.fillRect(50, 50, 100, 100);

		g.setColor(Color.ORANGE);
		g.fillOval(200, 50, 100, 100);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Graphics Example");
		frame.add(new GraphicsExample());
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
