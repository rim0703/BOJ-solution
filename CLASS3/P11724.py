import sys
input=sys.stdin.readline
"""RecursionError를 방지하기 위해서"""
sys.setrecursionlimit(10**6)

n,m=map(int,input().split())
graph={}

for i in range(n):
    graph[i+1]=set()

for j in range(m):
    start,end=map(int,input().split())
    graph[start].add(end)
    graph[end].add(start)

def dfs(start,graph):
    visited[start]=True
    for i in graph[start]:
        if not visited[i]:
            dfs(i,graph)

visited=[False]*(n+1)
result=0
for i in range(1,n+1):
    if not visited[i]:
        dfs(i,graph)
        result+=1
print(result)