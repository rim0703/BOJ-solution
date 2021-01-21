import heapq
import sys
input=sys.stdin.readline
"""최대힙 연습
nums=[4,1,7,3,8,5]
heap=[]

for num in nums:
    heapq.heappush(heap,(-num,num))
while heap:
    print(heapq.heappop(heap)[1])"""


n=int(input())
heap=[]
for _ in range(n):
    num=int(input())
    if num==0:
        if len(heap)==0:
            print(0)
        else:
            print(heapq.heappop(heap)[1])
    else:
        heapq.heappush(heap,(-num,num))

