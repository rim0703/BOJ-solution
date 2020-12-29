## 풀이노트

### #10951
 
 포인트: 테스트케이스의 갯수를 모름, 그렇기 때문에 for loop로 얼만큼 돌려야 되는지 모름
 
 풀이: EOF처리 (End of file)
 > <b>JAVA에서는 어떻게 할까? </b>
 > 
 > 파일 끝을 나타내는 EOF, 즉 데이터 소스로부터 더 이상 읽을 수 있는 데이터가 없음을 의미함
 > 
  Scanner class에서: 
    
      while(sc.hasNextLine()){
        sc.nextLien();
      }
      
   BufferedReader class에서:
   
      String input="";
      while((input=br.readLine()!=null){
        //
      }
 
  > <b>질문Q: Scanner와 BufferedReader의 차이점?</b>
  >
  > Scanner class는 타입에 따른 입력으로 편의를 제공함.
  >
  > 하지만 BufferedReader보다 속도가 느림.
