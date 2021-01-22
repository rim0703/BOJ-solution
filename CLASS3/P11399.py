import sys
input=sys.stdin.readline
n=int(input())
num=list(map(int,input().split()))
num.sort()
result=0
for i in range(n):
    result+=(num[i]*(n-i))
print(result)