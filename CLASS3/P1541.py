"""
최소값을 얻기 위해서 - 빼기 기호를 기준으로 괄호를 씌워주면 된다
"""
a=input().split('-')
num=[]
for i in a:
    cnt=0
    s=i.split('+')
    for j in s:
        cnt+=int(j)
    num.append(cnt)
n=num[0]
for i in range(1,len(num)):
    n-=num[i]
print(n)
