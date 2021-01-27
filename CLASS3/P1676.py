n=int(input())
dp=[0]*501
dp[0]=1
dp[1]=1
for i in range(2,n+1):
    dp[i]=i*dp[i-1]
result=dp[n]
count=0
while result%10==0:
    count+=1
    result=result//10
print(count)