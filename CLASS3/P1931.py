import sys

n=int(sys.stdin.readline())
list=[[0,0] for i in range(n)]

for i in range(n):
    #끝나는 시간순서로 저장
    list[i][1],list[i][0]=map(int,sys.stdin.readline().split())
list.sort()

count=0
if len(list)>0:
    end = list[0][0]
    count+=1
    for i in range(1,n):
        if list[i][1]>=end:
            end=list[i][0]
            count+=1
            #print("start time %d , end time %d"%(list[i][1],list[i][0]))
print(count)