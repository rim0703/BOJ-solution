"""
포인트:
     N 값: 0  1  2  3  4  5  6  7  8  9
0호출 횟수: 1  0  1  1  2  3  5  8  .. ..
1호출 횟수: 0  1  1  2  3  5  8  13 .. ..
"""

a=int(input())

zero=[1,0,1]
one=[0,1,1]

def sol(num):
    length=len(zero)
    if length<=num:
        for i in range(length,num+1):
            zero.append(zero[i-1]+zero[i-2])
            one.append(one[i-1]+one[i-2])
    print("%d %d"%(zero[num],one[num]))

for i in range(a):
    k=int(input())
    sol(k)