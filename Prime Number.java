class Solution {
    static boolean isPrime(int n) {
        // code here
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <=n; i++){
            if (n % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main (String[] args){
        
        System.out.println(isPrime(7));
        System.out.println(isPrime(25));
        System.out.println(isPrime(1));
    }   
}