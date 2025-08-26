class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int x = a; 
        int y = b;
        while (y != 0) {
            
            int rem = x % y;
            x = y;
            y = rem;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        return new int[]{lcm, gcd};
        
    }
    public static void main (String[] args){
        int[] ans = lcmAndGcd(14 , 8);
        System.out.println("[" + ans[0] + "," + ans[1] + "]" );
    }
}