
"""
점화식: dp(n)=min( dp(n//3)+1, dp(n//2)+1, dp(n-1)+1 )
"""
num=int(input())
dp=[0]*1000001
dp[1]=0

for i in range(2,num+1):
    dp[i]=dp[i-1]+1
    if i%2==0 and dp[i]>dp[i//2]+1:
        dp[i]=dp[i//2]+1
    if i%3==0 and dp[i]>dp[i//3]+1:
        dp[i]=dp[i//3]+1

print(dp[num])

