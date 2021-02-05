import sys
input=sys.stdin.readline

test_cace=int(input())
for _ in range(test_cace):
    n=int(input())
    dic={}
    result=0
    for i in range(n):
        name,type=input().split()
        if type not in dic:
            dic[type]=set()
            dic[type].add(name)
        else:
            dic[type].add(name)

    for item in dic:
        result=result+result*len(dic[item])+len(dic[item])

    print(result)