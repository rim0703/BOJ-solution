import sys
from queue import PriorityQueue
que=PriorityQueue()
n=int(sys.stdin.readline())
count=0
for _ in range(n):
    num=int(sys.stdin.readline())
    if num==0:
        if que.empty()==True:
            print(0)
        else:
            print(que.get())
    else:
        que.put(num)

