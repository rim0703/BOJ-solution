n=int(input())
a=1
b=2
result=0
for i in range(3,n+1):
    result=(a+b)%10007
    a,b=b,result
if n==1: print(1)
elif n==2: print(2)
else:
    print(result)