import sys
sys.setrecursionlimit(10000)
"""runtime에러를 해결하기 위한 import"""

def dfs(x,y):
    #상,하,좌,우 탐색
    dx=[1,-1,0,0]
    dy=[0,0,1,-1]

    for i in range(4):
        nx=x+dx[i]
        ny=y+dy[i]

        if(0<=nx<n) and (0<=ny<m):
            if graph[nx][ny]==1:
                #탐색환료된 칸은 -1으로 변경
                graph[nx][ny]=-1
                dfs(nx,ny)

T=int(input())
for i in range(T):

    m,n,k=map(int,input().split())

    graph=[[0]*m for i in range(n)]
    for i in range(k):
        a,b=map(int,input().split())
        graph[b][a]=1
    #print(graph)
    result=0
    for i in range(n):
        for j in range(m):
            if graph[i][j]>0:
                dfs(i,j)
                #print("%d %d"%(i,j))
                result+=1
    print(result)
