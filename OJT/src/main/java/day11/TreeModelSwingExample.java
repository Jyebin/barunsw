package day11;

import javax.swing.*;
import java.awt.*;

public class TreeModelSwingExample {
	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Tree Model Example");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 300); // 프레임 크기를 설정합니다.

			MyTreeNode rootNode = new MyTreeNode("Root");
			MyTreeNode childNode1 = new MyTreeNode("Child 1");
			MyTreeNode childNode2 = new MyTreeNode("Child 2");

			rootNode.addChild(childNode1);
			rootNode.addChild(childNode2);

			MyTreeModel treeModel = new MyTreeModel(rootNode);

			JTree tree = new JTree(treeModel);
			JScrollPane scrollPane = new JScrollPane(tree);

			frame.add(scrollPane, BorderLayout.CENTER);
			frame.setVisible(true);
		});
	}
}
