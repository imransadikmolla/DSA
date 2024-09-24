class SingleNumber {
    public int singleNumber(int[] nums) {
        //TC-O(n) and SC-O(n)
      //   Map<Integer,Integer> map=new HashMap<>();
      //   for(int i=0;i<nums.length;i++){
      //      map.put(nums[i],map.getOrDefault(nums[i],0)+1); 
      //   }
      //   for(Map.Entry<Integer,Integer> entry: map.entrySet()){
      //       if(entry.getValue()==1)
      //            return entry.getKey();
      //   }
      // return 0;
        
        // only TC-O(n)
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
