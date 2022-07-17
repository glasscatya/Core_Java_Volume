package priorityQueue;

import java.util.*;
import java.time.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        //priorityQueue 会使用堆来储存数据，根部放的永远是优先级最大的元素 默认1为最高优先级
        var queue = new PriorityQueue<LocalDate>();

        queue.add(LocalDate.of(1999,12,17));
        queue.add(LocalDate.of(21,12,21));
        queue.add(LocalDate.of(1956,12,15));
        queue.add(LocalDate.of(1799,12,11));

        System.out.println("使用迭代器打印所有元素");
        for(var p : queue)
            System.out.println(p);
        System.out.println("打印被删除的元素");
        while(!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
