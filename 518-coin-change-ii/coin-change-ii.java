class Solution {
    public int change(int amount, int[] coins) {
        int dp[] = new int[amount+1];
           dp[0] = 1;
        //   dp[0]=coins[0];
        //   dp[1]=coins[1];
           
           
           for(int coin : coins){
               for(int i= coin; i<=amount; i++){
                   dp[i] += dp[i-coin];
               }
           }
                      
            return dp[amount];          
       }
    }