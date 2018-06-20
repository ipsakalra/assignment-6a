interface Animals{
	public void speak();
	public void eat();
}
	class Cat implements Animals{
	public void speak(){
	System.out.println("cat speak...");
	}
	public void eat(){
	System.out.println("cat eat...");
	}
	}
	class Dog implements Animals{
	public void speak(){
	System.out.println("dog speak...");
	}
	public void eat(){
	System.out.println("dog eat...");
	}
	}
	class MyAnimal{
	public static void main(String args[]){
	Animals a=new Cat();
	Animals b=new Dog();
	a.speak();
	b.eat();
}
}

