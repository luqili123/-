package dynamic_programming;

public class 使用最小花费爬楼梯 {
	public static int minCostClimbingStairs(int[] cost) {
		if(cost.length==0||cost.length==1)
			return 0;
		if(cost.length==2){
			return Math.min(cost[0], cost[1]);
		}
		int[] dp=new int[cost.length];
		dp[0]=cost[0];
		dp[1]=cost[1];
		for(int i=2;i<cost.length;i++){
			dp[i]=Math.min(dp[i-1], dp[i-2])+cost[i];
		}
        return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }
	public static void main(String[] args) {
		int[] cost={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(minCostClimbingStairs(cost));
	}
}
