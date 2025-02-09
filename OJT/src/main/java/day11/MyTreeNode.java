package day11;

import java.util.ArrayList;
import java.util.List;

public class MyTreeNode {
    private String value; // 노드의 값을 저장할 변수
    private List<MyTreeNode> children;

    // String 매개변수를 받는 생성자 추가
    public MyTreeNode(String value) {
        this.value = value;
        this.children = new ArrayList<>(); // children 초기화
    }

    public List<MyTreeNode> getChildren() {
        if (this.children == null) {
            this.children = new ArrayList<>(); // null인 경우 빈 리스트 초기화
        }
        return this.children;
    }

    public void addChild(MyTreeNode child) {
        if (this.children == null) {
            this.children = new ArrayList<>(); // null인 경우 초기화
        }
        this.children.add(child);
    }

    // 추가: 노드의 값을 반환하는 메서드
    public String getValue() {
        return value;
    }
}
