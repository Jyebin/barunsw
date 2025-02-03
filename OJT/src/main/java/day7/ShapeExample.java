package day7;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ShapeExample extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		Shape rectangle = new Rectangle2D.Double(50, 50, 150, 100);
		g2d.setColor(Color.BLUE);
		g2d.fill(rectangle);
		

		Shape circle = new Ellipse2D.Double(250, 50, 100, 100);
		g2d.setColor(Color.RED);
		g2d.fill(circle);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Shape Example");
		ShapeExample shapeExample = new ShapeExample();

		frame.add(shapeExample);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
