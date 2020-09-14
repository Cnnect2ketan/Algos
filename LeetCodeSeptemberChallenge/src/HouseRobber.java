import java.util.ArrayList;

public class HouseRobber {
    public int maxSumAtPos[] ;
    public int maxSum(int a[], int pos){

        if(maxSumAtPos[pos]!=0)
            return maxSumAtPos[pos];
        int sum = a[pos];
        for(int i=pos+2; i<a.length;i++){
            int newSum= maxSum(a,i)+a[pos];
            if(newSum>sum)
                sum=newSum;
        }
        maxSumAtPos[pos]=sum;
        return sum;
    }
    public int rob(int[] nums) {
        maxSumAtPos = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                continue;
            int newSum=maxSum(nums,i);
            if(sum<newSum)
                sum=newSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] array = {1,2,3,1};
        System.out.println(houseRobber.rob(array));
    }
}
