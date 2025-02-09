//package day11;
//
//public class TreeModelExample {
//	public static void main(String[] args) {
//		MyTreeNode rootNode = new MyTreeNode("Root"); // 루트 노드 생성
//		MyTreeNode childNode1 = new MyTreeNode("Child 1"); // 첫 번째 자식 노드 생성
//		MyTreeNode childNode2 = new MyTreeNode("Child 2"); // 두 번째 자식 노드 생성
//
//		rootNode.addChild(childNode1); // 첫 번째 자식 추가
//		rootNode.addChild(childNode2); // 두 번째 자식 추가
//
//		MyTreeModel treeModel = new MyTreeModel(rootNode); // MyTreeModel을 생성하고 루트 노드를 설정
//
//		System.out.println("Root: " + treeModel.getRoot());
//		System.out.println("Child count of root: " + treeModel.getChildCount(rootNode));
//		System.out.println("First child of root: " + treeModel.getChild(rootNode, 0));
//		System.out.println("Index of Child 1: " + treeModel.getIndexOfChild(rootNode, childNode1));
//		System.out.println("Is Child 1 a leaf? " + treeModel.isLeaf(childNode1));
//	}
//}
