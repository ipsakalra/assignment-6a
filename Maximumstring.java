import java.util.*;
class Maximumstring{
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();
void comp(){
if(Integer.parseInt(a)>Integer.parseInt(b)){
	System.out.println("A is bigger");
}
else{
	System.out.println("B is bigger");
}
}
public static void main(String[] args){
	System.out.println("enter the value of a and b: ");
	Maximumstring m=new Maximumstring();
	m.comp();
	}
}