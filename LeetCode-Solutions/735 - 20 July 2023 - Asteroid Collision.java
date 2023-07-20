/*
Runtime
Details 12ms
Beats 56.69%of users with Java

Memory
Details 43.48mb
Beats 99.64%of users with Java
*/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) st.push(asteroids[i]);
            else {
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])) st.pop();
                if(st.isEmpty() || st.peek()<0) st.push(asteroids[i]);
                else if(st.peek() == Math.abs(asteroids[i])) st.pop();
            }
        }
        int[] res = new int[st.size()];
        for (int i=res.length-1; i>=0; i--) res[i] = st.pop();
        return res;
    }
}
