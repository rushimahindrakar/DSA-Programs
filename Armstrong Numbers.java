// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        //int n = 153;
        int temp = n;
        int r, sum = 0;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }

        if (temp == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
    }  

    public static void main(String[] args) {
        armstrongNumber(153); // true
        armstrongNumber(372); // false
        armstrongNumber(100); // false
    }
}