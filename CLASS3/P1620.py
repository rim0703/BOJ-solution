#시간초과!! sys.stdin.readline()으로 대용량 데이터 빨리받기
import sys
n,m=map(int,sys.stdin.readline().split())
dic={}
#이름리스트 생성
for i in range(1,n+1):
    dic[sys.stdin.readline()[:-1]]=i
#여기서 매번 key, value를 검색하지 않기위해서
#key, value를 앞뒤 바꿔서 딕셔너리 하나 다시 생성해줌
dic_reverse={v:k for k,v in dic.items()}
#검색
for i in range(m):
    search=sys.stdin.readline()[:-1]
    if dic.get(search)!=None:
        print(dic.get(search))
    else:
        print(dic_reverse.get(int(search)))
