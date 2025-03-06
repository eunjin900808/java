package lambda;

interface SearchWordInterface{
	public int method(String a, String b);
}

public class StringSearchWord {

	public static void main(String[] args) {
		// (문자열,단어) -> 찾으려는 단어는 2개 있습니다.
		SearchWordInterface si = (str,word) ->{
			
			String[] array = str.split(word);
			int cnt = array.length-1;	// {배열개수-1} == {찾는단어개수}
			// 찾는 단어가 맨뒤에 있는 경우 (-1)가감 처리 하면 안됨.
			
//			int wordLen = word.length();	//찾는 단어의 길이를 얻어냄
//			int index = 0;	//단어를 찾았을때의 위치번호를 입력할 용도
//			int cnt = 0;	//단어를 찾았을때의 카운트
//			while(true) {
//				index = str.indexOf(word);	//0
//				if(index > -1) {
//					cnt++;
//					str = str.substring(index+wordLen);
//				}else break;
//			}
//			
			return cnt;
		};
		String str = "람다식이란 함수를 하나의 식으로 표현한 것이다.\n"
					+"람다식은 익명함수 형식으로 제작이 된다 \n"
					+"익명함수란 함수의 이름이 없는 함수로 변수처럼 사용 가능하고 매개변수 전달도 가능하다";
		String word= "함수";
		int cnt = si.method(str, word);
		System.out.println("찾으려는 단어는" + cnt + "개 있습니다.");
	}

}
