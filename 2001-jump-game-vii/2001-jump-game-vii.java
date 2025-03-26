class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if(s.charAt(n - 1) == '1') return false;
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        int far = 0; 
        while(que.size() > 0) {
            int i = que.remove();
            int start = Math.max(i + minJump, far + 1);
            for(int j = start; j <= Math.min(i + maxJump, n - 1); j++) {
                if(s.charAt(j) == '0') que.add(j);
                if(j == n - 1) return true;
            }
            far = i + maxJump;
        }
        return false;
    }
}