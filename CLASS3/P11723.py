import sys
input=sys.stdin.readline

m=int(input())
stack=[]
for _ in range(m):
    str=input().split()
    if str[0]=="add":
        if int(str[1]) not in stack:
            stack.append(int(str[1]))
    elif str[0]=="remove":
        if int(str[1]) in stack:
            stack.pop(stack.index(int(str[1])))
    elif str[0]=="check":
        if int(str[1]) in stack:
            print(1)
        else:
            print(0)
    elif str[0]=="toggle":
        if int(str[1]) in stack:
            stack.pop(stack.index(int(str[1])))
        else:
            stack.append(int(str[1]))
    elif str[0]=="empty":
        stack=[]
    elif str[0]=="all":
        stack=[1*i for i in range(1,21)]
        #print(stack)