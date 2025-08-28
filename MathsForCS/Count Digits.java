// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int original = n;
        int count = 0;
        
        while (n > 0){
            
            int digit = n % 10;
            if (digit !=0 && original % digit ==0){
                count++;
                
            }
            n/=10;
        }
        return count;
        
    }
        
        public static void main(String[]arg){
            System.out.println(evenlyDivides(12));
            System.out.println(evenlyDivides(2446));
            System.out.println(evenlyDivides(23));
        }
    }
