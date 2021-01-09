## 풀이노트

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