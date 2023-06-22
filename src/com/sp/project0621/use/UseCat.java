package com.sp.project0621.use;
import com.sp.project0621.animal.Cat;

class UseCat{
	public static void main(String[] args){
		Cat c=new Cat();

		c.setAge(5); //setter 를 통해 데이터 변경. 자바에서는 c.age 변수 접근 하지 않음
		int age=c.getAge(); //getter 를 통해 데이터 접근
		System.out.println("나이는 "+age);

		c.setName("뮤"); //고양이 이름을 뮤 로 바꾸고
		String name=c.getName(); //바뀐 이름을 조회하여 출력하기
		System.out.println("고양이 이름은 "+name);
	}
}
