package com.sp.project0621.use;
import com.sp.project0621.animal.Cat;

class UseCat{
	public static void main(String[] args){
		Cat c=new Cat();

		c.setAge(5); //setter �� ���� ������ ����. �ڹٿ����� c.age ���� ���� ���� ����
		int age=c.getAge(); //getter �� ���� ������ ����
		System.out.println("���̴� "+age);

		c.setName("��"); //����� �̸��� �� �� �ٲٰ�
		String name=c.getName(); //�ٲ� �̸��� ��ȸ�Ͽ� ����ϱ�
		System.out.println("����� �̸��� "+name);
	}
}
