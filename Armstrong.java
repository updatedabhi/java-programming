class Solution {
    void check(int n) {
        int sum = 0, temp = n, r;
        while (n != 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is Armstrong number");
        } else {
            System.out.println("Chutiya samjhe ho kya phir se number dalo");
        }
    }
}

public class Armstrong {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.check(153);
    }
}