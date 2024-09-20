public class MaxSubArraySumOrKadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,-1,-1,-4,3,3};
		int max=Integer.MIN_VALUE;
		int curr=0;
		for(int i=0;i<arr.length;i++) {
			curr+=arr[i];
			max=Math.max(max, curr);
			if(curr<0)
				curr=0;
		}
		System.out.print(max);

	}

}
