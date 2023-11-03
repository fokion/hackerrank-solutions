import java.util.*;
public class DequeSliding {
 //https://www.hackerrank.com/challenges/java-dequeue/problem
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();


        int max = 0;
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            //does not throw exception if queue is full
            deque.offer(num);
            unique.add(num);
            //if it is the same size then review and slide
            if (deque.size() == m) {
                if (unique.size() > max) {
                    max = unique.size();
                }
                // sliding window by one element
                Integer removed = deque.pop();
                if (!deque.contains(removed)) {
                    unique.remove(removed);
                }
            }
        }
        System.out.println(max);
    }
}



