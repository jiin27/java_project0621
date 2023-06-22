public class Dog{
	private String name;
	private Food f;

	public void setName(String d) {
       name=d;
   }

	public void setFood(Food fd) {
      f=fd;
   }

}

public class UseDog{
	public static void main(String[] args){
		Dog d=new Dog();
		d.setName("Çªµé");
		d.setFood=(new Food());
	}
}
