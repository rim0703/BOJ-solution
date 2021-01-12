import sys

n=int(sys.stdin.readline())
paper=[list(map(int,sys.stdin.readline().split()))for _ in range(n)]

white=0
blue=0

def sol(x,y,n):
    global white,blue
    count=0
    for i in range(x,x+n):
        for j in range(y,y+n):
            if paper[i][j]:
                count+=1
    if not count:
        white+=1
    elif count==n**2:
        blue+=1
    else:
        sol(x,y,n//2)           #상 좌
        sol(x+n//2,y,n//2)      #상 우
        sol(x,y+n//2,n//2)      #하 좌
        sol(x+n//2,y+n//2,n//2) #하 우
sol(0,0,n)
print(white)
print(blue)