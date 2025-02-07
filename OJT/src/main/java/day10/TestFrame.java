package day10;

import javax.swing.JFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFrame extends JFrame{
	private static final Logger LOGGER = LoggerFactory.getLogger(TestFrame.class);
	
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	
	private TestPanel testPanel = new TestPanel();
	
}
