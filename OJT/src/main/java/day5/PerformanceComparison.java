package day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PerformanceComparison {
    public static void main(String[] args) {
        // 큰 리스트 생성
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        // for문 성능 측정
        long startTimeForLoop = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i); // 인덱스를 통해 접근
        }
        long endTimeForLoop = System.nanoTime();
        long durationForLoop = endTimeForLoop - startTimeForLoop;

        // Iterator 성능 측정
        long startTimeIterator = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next(); // 현재 위치에서 다음 요소 접근
        }
        long endTimeIterator = System.nanoTime();
        long durationIterator = endTimeIterator - startTimeIterator;

        // 결과 출력
        System.out.println("For Loop Duration: " + durationForLoop + " nanoseconds");
        System.out.println("Iterator Duration: " + durationIterator + " nanoseconds");
    }
}
