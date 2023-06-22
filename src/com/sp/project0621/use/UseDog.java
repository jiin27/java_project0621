package com.sp.project0621.use;

//사용하려는 클래스가 나와는 다른 위치에 있을 때는 반드시 import 해야한다.
//이때 import의 위치는 환경 변수에 등록된 바이너리 루트를 기준으로 한다.
import com.sp.project0621.animal.Dog;

class UseDog{

	public static void main(String[] args){
		Dog d=new Dog();
		boolean gender=d.isBoy();
		System.out.println(gender);
	}
}