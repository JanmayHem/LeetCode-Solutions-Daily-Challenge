import java.util.Arrays;
import java.util.PriorityQueue;
import javafx.util.Pair;

public class Solution {
    public static double MinimiseMaxDistance(int []arr, int K){
        int n = arr.length;
        double []diff = new double[n - 1];
        double []count = new double[n - 1];
        Arrays.fill(count, 1);
        PriorityQueue<Pair<Double, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getKey() - a.getKey() < 0)? -1: (b.getKey() - a.getKey() > 0)? 1: b.getValue() - a.getValue());
        for(int i=0; i<n-1; i++) {
            diff[i] = arr[i+1]-arr[i];
            pq.offer(new Pair(diff[i], i));
        }
        for(int j=1; j<=K; j++){
            Pair<Double,Integer> best = pq.peek();
            int i = best.getValue();
            count[i]++;
            pq.poll();
            pq.add(new Pair(diff[i]/count[i], i));
        }
        return (double) pq.peek().getKey();
    }
}
