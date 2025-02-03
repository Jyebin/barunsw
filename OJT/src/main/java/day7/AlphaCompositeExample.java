package day7;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlphaCompositeExample extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.RED);
		g2d.fill(new Ellipse2D.Double(50, 50, 150, 150));

		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
		//AlphaComposite : 소스 색상(새로운 색상)과 대상 색상(이미 그려진 색상)을 결합하여 최종 색상을 생성하는 클래스
		//SRC_OVER : 소스 색상을 대상 색상 위에 그리도록 함, 0.5f : 투명도
		g2d.setComposite(ac);

		g2d.setColor(Color.BLUE);
		g2d.fill(new Ellipse2D.Double(100, 100, 150, 150));
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("AlphaComposite Example");
		frame.add(new AlphaCompositeExample());
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}