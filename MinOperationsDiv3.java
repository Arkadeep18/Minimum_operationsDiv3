package practice_prev;

public class MinOperationsDiv3 {
	static int MinOp(int nums[]) {
		int count=0;
		int n = nums.length;
		for(int i=0;i<n;i++) {
			int rem = nums[i]%3;
			if(rem!=0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int nums [] = {5,6,7,8,9,10};	
		
		int ans = MinOp(nums);
		System.out.println("Answer: "+ans);
		}

}
