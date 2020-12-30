## 풀이노트

### #1181 (단어 정렬)

 - 포인트: Arrays.sort()를 사용하여 string을 알파벳순서로 정렬가능함.
 - 키워드: 특정 정렬방법을 따라야 할 때는 comparator를 사용하여 새로 정의할 수 있음.
 - 코드:
	Arrays.sort(str, new Comparator<String>() {
	@Override
	public int compare(String o1, String o2) {
		//두개의 문자열의 길이가 같을 때:
		if(o1.length()==o2.length()){
			return o1.compareTo(o2);
		}
		//그 외
		else{
			return o1.length()-o2.length();
		}
	}
	});