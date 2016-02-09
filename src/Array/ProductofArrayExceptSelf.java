package Array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	public static void main(String args[]) {
		int[] numbers = new int[] { -1, 3, 1 };
		System.out.println(Arrays.toString(productExceptSelf(numbers)));
	}
	public static int[] productExceptSelf(int[] nums) {
		int len=nums.length;;
        int R=1;
        int result[]=new int[len];
        result[0]=1;
        for(int i=1;i<len;i++)
            result[i]=result[i-1]*nums[i-1];
        for(int i=len-1;i>=0;i--){
            result[i]=result[i]*R;
            R=R*nums[i];
        }
        return result;
    }

}
