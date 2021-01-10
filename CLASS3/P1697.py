"""
직접 queue를 사욯하여 풀었을 때: 492ms
deque를 사용하여 풀었을 때: 148ms

"""

import sys
from collections import deque

n,k=map(int,sys.stdin.readline().split())
visited=[0]*100001


def sol(visited,n,k):
    queue=deque()
    queue.append(n)

    while queue:
        #print(queue)
        x=queue.popleft()
        if x==k:
            return visited[x]
        for nx in (x-1,x+1,x*2):
            if nx>=0 and nx<=100000 and visited[nx]==0:
                visited[nx]=visited[x]+1
                queue.append(nx)

print(sol(visited,n,k))