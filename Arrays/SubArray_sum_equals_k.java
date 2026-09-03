

public class SubArray_sum_equals_k {

	public static void main(String[] args) {
		int []nums= {1,1,1};
		int k=2;
		int prefix[]=new int[nums.length];
		prefix[0]=nums[0];
		for(int i=1; i<prefix.length; i++) {
			prefix[i]=nums[i]+prefix[i-1];
					
		}
		int count=1;
		for(int i=0; i<prefix.length; i++) {
			if(prefix[i]==k) {
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}