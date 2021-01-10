"""
P1074: Z 다시풀기
"""
n,r,c=map(int,input().split())
#각 변의 길이
length=pow(2,n)

#무한 루프로 돌려서 최소 Z모양인 2*2로 만들기
result=0
while True:
    if r<2 and c<2:
        result+=2*r+c
        break
    else:
        """
        최소2*2의 Z:          좌표:
            0   1    ->   (0,0)  (0,1)
            2   3    ->   (1,0)  (1,1)
        """

        length=length//2      #길이로 4등분 만들기
        t_r=r//length         #row의 위치를 0,1로 만듬
        t_c=c//length         #col의 위치를 0,1로 만듬
        #해당 칸의 왼쪽 상단의 숫자를 구함
        result+=(t_r*2+t_c)*pow(length,2)

        r=r-t_r*length
        c=c-t_c*length

print(result)
