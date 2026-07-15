class Solution {
    public int sumOdd(int n){
        int sum = 0;
        int count = 0;
        for(int i = 0; i>=0; i++){
            if(i % 2 != 0){
                sum += i;
                count++;
            }
            if(count == n) return sum;
        }
        return sum;
    }
    public int sumEven(int n){
         int sum = 0;
         int count = 0;
        for(int i = 0; i>=0; i++){
            if(i % 2 == 0){
                sum += i;
                count++;
            }
            if(count == n) return sum;
        }
        return sum;
    }

    public int gcd(int a , int b){
        int min = Math.min(a,b);

        for(int i = min; i>=1; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 0;
    }
    public int gcdOfOddEvenSums(int n) {
        if(n == 1) return 1;
        int even = sumEven(n);
        int odd = sumOdd(n);
        return gcd(even , odd);
    }
}