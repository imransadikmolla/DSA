class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int aux[]=new int[prices.length];
        int auxMax=Integer.MIN_VALUE;
        // Auxulioary array for max value available at right
        for(int i=prices.length-1;i>=0;i--){
            aux[i]=Math.max(auxMax,prices[i]);
            if(prices[i]>auxMax)
                auxMax=prices[i];
        }
        
        // Checking the didffrenec for each value with available right value
         for(int i=0;i<prices.length;i++){            
           int diff=aux[i]-prices[i];
           if(diff>max)
                max=diff;
        }
        return max;
    }
}
