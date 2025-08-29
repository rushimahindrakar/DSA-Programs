// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
        if (n <= 1) return 0;
        return (int) Math.sqrt(n-1);
    }
    public static void main(String[] args){
        System.out.println(countSquares(9));
        System.out.println(countSquares(3));
        System.out.println(countSquares(1));
    }
}