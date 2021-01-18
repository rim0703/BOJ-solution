import bisect  #Binary Search Algorithm
import sys
from collections import deque
input=sys.stdin.readline

t=int(input())
for i in range(t):
    k=int(input())
    queue=deque()
    queueDict=dict()
    for _ in range(k):
        str=input().split()
        val=int(str[1])

        if str[0]=="I":
            try:
                queueDict[val]+=1
            except:
                queueDict[val]=1
                bisect.insort_left(queue,val)
                #print(queue)

        else:
            if not queue:
                continue
            #최소값 지우기
            if val==-1:
                if queueDict[queue[0]]==1:
                    queueDict.pop(queue[0])
                    queue.popleft()
                else:
                    queueDict[queue[0]]-=1
            #최대값 지우기
            else:
                if queueDict[queue[-1]]==1:
                    queueDict.pop(queue[-1])
                    queue.pop()
                else:
                    queueDict[queue[-1]]-=1
    if not queue:
        print("EMPTY")
    else:
        print(queue[-1],queue[0])

