abstract class Animal{
	String breed;
	String color;
	String name;
	Animal(String br,String cr,String na)
	{
		breed=br;
		color=cr;
		name=na;
	}
	public void speak(){
		System.out.println("animal speaking...");
	}
	public abstract void eat();
}
class Dog extends Animal{
	Dog(String br,String cr,String na){
		super(br,cr,na);
	}
	public void speak(){
		System.out.println("dog speaking...");
	}
	public void eat(){
		System.out.println("dog eating...");
	}
}
class Demo1{
	public static void main(String[] args){
		Dog d=new Dog("labrodoor","black","tommy");
		d.speak();
		d.eat();
	}
	}
