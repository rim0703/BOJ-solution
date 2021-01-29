from collections import deque

n,m=map(int,input().split())
a=[[]for _ in range(n)]
q,res,ans=deque(),[],[]

def bfs(x):
    q.append(x)
    c=[-1 for _ in range(n)]
    c[x]=0
    while q:
        x=q.popleft()
        for i in a[x]:
            if c[i]==-1:
                c[i]=c[x]+1
                q.append(i)
    cnt=0
    for i in range(n):
        if c[i]!=-1:
            cnt+=c[i]
    return cnt

for _ in range(m):
    x,y=map(int,input().split())
    x-=1;y-=1
    a[x].append(y)
    a[y].append(x)

for i in range(n):
    res.append(bfs(i))

for i in range(n):
    if res[i]==min(res):
        ans.append(i)

print(min(ans)+1)