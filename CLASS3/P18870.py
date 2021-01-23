import sys
input=sys.stdin.readline

n=int(input())
num=[[0,0,0] for _ in range(n)]
str=list(map(int,input().split()))
for i in range(n):
    num[i][0]=i
    num[i][1]=str[i]

num.sort(key=lambda x:x[1])
index=0
for i in range(1,n):
    if num[i][1]==num[i-1][1]:
        num[i][2]=index
    else:
        index+=1
        num[i][2]=index

num.sort(key=lambda  x:x[0])

for i in range(n):
    print(num[i][2],end=' ')

"""다른 분의 풀이 ㅠㅠ 
n=int(input())
x=list(map(int,input().split()))
xt=list(sorted(set(x)))
xt={xt[i]:i for i in range(len(xt))}
print(*[xt[i] for i in x])"""