import sys
#HashMap key->value
dic={}

for i in range(int(sys.stdin.readline())):
    dic[i+1]=set()

for j in range(int(sys.stdin.readline())):
    a,b=map(int,sys.stdin.readline().split())
    dic[a].add(b) #a->b
    dic[b].add(a) #b->a

def dfs(start,dic):
    for i in dic[start]:
        if i not in visited:
            visited.append(i)
            dfs(i,dic)

visited=[]
dfs(1,dic)
print(len(visited)-1)
