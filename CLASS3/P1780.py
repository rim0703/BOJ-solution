import sys
input=sys.stdin.readline

N=int(input())
matrix=[]
result=[0]*3

for _ in range(N):
    matrix.append(list(map(int,input().split())))

def check(start_x:int, start_y:int, n:int):
    temp=matrix[start_x][start_y]
    for i in range(n):
        for j in range(n):
            if temp!=matrix[start_x+i][start_y+j]:
                return False
    return True

def divide(start_x:int, start_y:int, n:int):
    if check(start_x,start_y,n):
        result[matrix[start_x][start_y]+1]+=1
    else:
        for i in range(3):
            for j in range(3):
                divide(start_x+i*n//3,start_y+j*n//3,n//3)
    return

divide(0,0,N)
for i in range(3):
    print(result[i])