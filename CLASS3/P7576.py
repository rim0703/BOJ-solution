from collections import deque
m,n=map(int,input().split())
graph=[]
queue=deque()
"""dx,dy 상,하,좌,우 확인을 위해 좌표값 바꾸기"""
dx=[1,-1,0,0]
dy=[0,0,1,-1]
for i in range(n):
    graph.append(list(map(int,input().split())))

for i in range(n):
    for j in range(m):
        if graph[i][j]==1:
            queue.append([i,j])

"""여기부터BFS"""
while len(queue)!=0:
    a,b=queue.popleft()
    for i in range(4):
        x=a+dx[i]
        y=b+dy[i]
        if 0<=x<n and 0<=y<m and graph[x][y]==0:
            graph[x][y]=graph[a][b]+1
            queue.append([x,y])
"""탐색 끝"""
#print(graph)
isTrue=False
#-1값은 이미 사용중이라서..-2로 대체함
result=-2
for i in graph:
    for j in i:
        if j==0:
            isTrue=True
        result=max(result,j)
if isTrue==True:
    print(-1)
elif result==-1:
    print(0)
else:
    print(result-1)