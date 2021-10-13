package Simple;

public class Car extends Vehicle {
	public String name="Rohan";
 public String mobileno;
	
	public void drive()
	{
		System.out.println("Child class driving");
	}
	public void stop()
	{
		System.out.println("Child class stopping");
	}
public void music()
{
	System.out.println(" Child class music");
}

public void fly()
{
	System.out.println("This is for flying");
}

public void jump()
{
	System.out.println("This is for jumping");
}
	public static void main(String[] args) {
		
Vehicle p=new Car();
Car s=(Car)p;
p.drive();//Using upcasting can access the child overloaded methods
p.stop();//Using upcasting can access the child overloaded methods
//p.music(); /*Using upcasting cannot access the child methods(which are not overridden) with parent reference */
p.horn();//Using upcasting can access the parent methods
s.fly();
s.jump();
System.out.println(p.name);//overloaded child variablees can be accessed
System.out.println(p.address); //parent class variables can be accessed
/*System.out.println(p.mobileno);//child class variavles cannot be accesed by parent reference */

/*using upcasting ie using parent reference only parent variables/methods and overloaded child variables/methods can be accesses
 but child variables and methods cannot be accessed */

/*c.drive();
c.stop();
System.out.println("My name is: " +c.name);
System.out.println("My address is: " +c.address);
System.out.println("My age is: " +c.get());
*/
	}

}
