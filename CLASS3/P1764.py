import sys
n,m=map(int,sys.stdin.readline().split())
#리스트를 한개로 묶어서 시간 최소화 하기!
name_list=[]
result=[]
for _ in range(n+m):
    name_list.append(sys.stdin.readline()[:-1])
name_list.sort()
count=0
while count<n+m-1:
    if name_list[count]==name_list[count+1]:
        result.append(name_list[count])
        count+=2
    else:
        count+=1

print(len(result))
for _ in range(len(result)):
    print(result[_])