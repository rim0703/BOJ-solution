import sys
from collections import deque
input=sys.stdin.readline

def dfs(start,graph):
    visited=[]
    stack=[start]

    while stack:
        n=stack.pop()
        if n not in visited:
            visited.append(n)
            if n in graph:
                temp=list(set(graph[n])-set(visited))
                temp.sort(reverse=True)
                stack+=temp
    return " ".join(str(i) for i in visited)

def bfs(start,graph):
    visited=[]
    queue=deque([start])

    while queue:
        n=queue.popleft()
        if n not in visited:
            visited.append(n)
            if n in graph:
                temp=list(set(graph[n])-set(visited))
                temp.sort()
                queue+=temp
    return " ".join(str(i) for i in visited)

node,edge,start=map(int,input().split())
graph={}
for _ in range(edge):
    a,b=map(int,input().split())
    if a not in graph:
        graph[a]=[b]
    elif b not in graph[a]:
        graph[a].append(b)

    if b not in graph:
        graph[b]=[a]
    elif a not in graph[b]:
        graph[b].append(a)

print(dfs(start,graph))
print(bfs(start,graph))