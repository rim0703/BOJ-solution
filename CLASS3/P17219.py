import sys
input=sys.stdin.readline

n,m=map(int,input().split())
dic={}
for _ in range(n):
    link,pw=input().split(' ')
    dic[link]=pw[:-1]
for _ in range(m):
    link=input()[:-1]
    print(dic[link])