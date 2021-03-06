## 풀이노트(essential)

### #1074(Z)
재귀문제, 계속 4등분하여 2*2규격이 나올 때 까지 반복함. 상세 내용은 [코드](./P1074.py "Z 파이썬풀이")

### #1463(1로 만들기)
dp문제, dp의 점화식을 찾는게 포인트!!

<code>점화식: dp(n)=min( dp(n//3)+1, dp(n//2)+1, dp(n-1)+1 )</code>


### #1620(나는야 포켓몬 마스터 이다솜)

  딱히 어려운 부분은 없음. 다만 세세한 부분에서 에러나 시간초과가 발생할 수 있음.
 
  - <code>sys.stdin.readline()</code>을 이용하여 대용량 데이터를 빨리 읽을 수 있게 하기. <br>
  (미사용시 '시간초과' 발생, java에서 사용하는 BufferedReader와 비슷한 것)
  - python에서 HashMap의 개념으로 dictionary를 사용함. (key값,value값) 으로 구성됨. <br>
  직접 key값으로 value를 불러올 수는 있지만, 반대로 value값으로 key값을 직접 불러오는 함수는 없어서 for loop을 사용하여 구현할 수 있음.
  하지만 이 방법은 효율성이 낮음. <br>
  해결방법: dictionary를 2개만듬. 1개는 ( key, value)구조, 다른 한 개는 (value,key)구조.
  - <code>dic.get("a")</code> key값이 "a"인 element의 value를 불러오기.
  - ^^;; 별로 어려움은 없는 문제지만, 이게뭐라고 4출만에 맞음?...
  
### #1697(숨바꼭질)
BFS,queue를 활용한 최단경로 탐색, 하지만 이 문제에서는 deque로 시간을 줄일 수 있음.<br>
  - 약 3배정도의 시간차이가 발생. deque>queue
  - 둘의 차이점: deque는 앞쪽,뒷쪽 둘 다 삽입,삭제 가능/ queue는 뒷쪽에서 들어와서 앞쪽으로 나감

### #1764(듣보잡)
문제를 읽으면 2개의 리스트로 입력을 받아야 할 것 같지만, 이렇게 하면 '시간초과'뜸
  - 1개의 list로 전체를 받아서 그 중에서 앞,뒤 둘이 같으면 result에 추가함
  - 문제에서 사전순서로 정렬해야 하기 때문에 입력 받은 리스트를 정렬하고 비교하면, result리스트에는 자동으로 정렬된 순서로 추가하게 됨
  - list에 존재 여부를 판단하는 <code>in</code>: list에 대해 탐색할 때 <code>in</code>을 사용하면 for loop과 같이 전체를 돌리기때문에 시간상으로 비효율적임

### #1927(최소 힙)
  - 파이썬에서 선언: <code>from queue import PriorityQueue</code> <br>
  - min heap의 대표적인 자료구조 priority queue.<br>
  - 일반 queue와 달리 <code>queue.get()</code>을 사용하면 가장작은 값을 반환한다
  
### #1931(회의실 배정)
  - 전형적인 그리디 알고리즘 문제
  - 입력으로 받는 시작시간, 끝나는 시간 을 역으로 저장 (끝나는 시간, 시작 시간)하여 제일 빨리 끝나는 회의를 첫 회의로 하여 뒤에있는 회의들 또한 최대한 빨리 끝나게 하여 많은 회의 수를 확보

### #2606(바이러스)
  - 그래프 문제, DFS/BFS로 해결가능
  - 시작점이 1번 컴퓨터이기 때문에 1번으로 고정 시작하여 재귀적으로 dfs사용하면 끝.
  - **주의점: DFS구현/재귀
 
### #2630(색종이 만들기)
  - 분할+재귀는 언제나 어렵게 느껴지누ㅠㅠ;;;
  
### #7576(토마토)
  - BFS를 사용한 그래프 탐색
  - <code>dx=[1,-1,0,0] dy=[0,0,1,-1]</code> 좌표(상,하,좌,우)탐색 시 유용하게 사용됨. 맨 위에 선언하면 편함
  - 다시 풀어보기...
  
### #7662(이중 우선순위 큐) 
  - 여러개의 같은 값이 존재할 수 있기 때문에 직접 풀이하면, 시간초과됨 (deque와dictionary로 풀이)
  - python에서 Binary Search를 <code>import bisect</code>로 선언함
  - <code>bisect.insort_left(queue,val)</code>정렬된 배열에서 왼쪽에 삽입
  
### #9095(1,2,3 더하기)
  - DP점화식: <code>dp(n)=dp(n-3)+dp(n-2)+dp(n-1)</code>
  
### #11279(최대 힙)
  - <code>import heapq</code>를 사용한 python3에서의 힙
  - 연결된 문제:[#1927(최소 힙)](#1927최소-힙)
  
### #11724(연결 요소의 개수)
  - DFS/BFS문제
  - RecursionError를 방지하기 위해서 <code>sys.setrecursionlimit(10**6)</code>사용해주기
  
### #11726(2xn 타일링)
  - dp문제라고 해서 모두 배열이 필요한 것은 아님.
  - 이 문제에서 변수3개로 돌려가며 구함
  
### #18870(좌표 압축)
  - 배열에서 특정부분에 대해서 정렬할 때 <code>num.sort(key=lambda x:x[1])</code>를 사용하면 배열의 두번째 요소로 정렬함
  - Python에서 print로 한 줄에 출력하기 위해서는 <code>print(num[i],end=' ')</code> print함수에 end부분 추가함면 됨
  