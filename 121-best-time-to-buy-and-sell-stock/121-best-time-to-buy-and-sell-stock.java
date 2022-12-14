class Solution {
    public int maxProfit(int[] prices) {
    int n=prices.length;
        int buy[]=new int[n];
        int sell[]=new int[n];
        buy[0]=prices[0];
        sell[n-1]=prices[n-1];
        
        
    for(int i=1;i<n;i++){
        buy[i]=Math.min(buy[i-1],prices[i]);

        }
            
    for(int i=n-2;i>=0;i--){
        sell[i]=Math.max(buy[i+1],prices[i]);

        }
        int max=0;
          for(int i=1;i<n;i++){
        max=Math.max(max,sell[i]-buy[i]);

        }
        
   return max; }
}