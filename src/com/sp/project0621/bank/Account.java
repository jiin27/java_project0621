/*
객체 지향 언어의 특징
1) 상속
2) 은닉화(내부를 노출하지 않는 것)
3) 추상화(복잡한 코드를 간략화 시키는 것)
4) 다형성(polymorphism)
*/

package com.sp.project0621.bank;

//고객의 계좌를 정의
public class Account{
	//자바에서는 개발자가 아무론 접근제한자를 명시하지 않으면
	//디폴트로 default 접근 제한자가 적용된다.
	//public - 보안X
	//protected - 상속 관계에 있을 때와 같은 패키지에 있을 때 허용
	//default - 오직 같은 패키지에서만 접근가능
	//private - 해당 클래스만. 즉 해당 클래스 내에서는 접근 가능(클래스 내 메서드에서 변수에 접근 가능). 이외는 접근 불가
	private String num="116-445-066424"; //연산하지 않을 수는 모두 문자 취급! 앞에 0이 온다면 숫자취급시 무시되기 때문.
	private int balance=1000000000;
	private String name="Hope";

	//잔고 변경
	public void setBalance(int b){ //메서드는 데이터가 아니기 때문에 공개해도 무방!
		//외부에서 전달된 값이 음수라면, 이 데이터는 해킹으로 취급.
		if(b>0){
			balance=b;
		}
	}

	public int getBalance(){
		return balance;
	}
}
