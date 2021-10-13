package Simple;

public class Vehicle {
	public String name="Adeep";
	public String address="Bangalore";
	private int age=34;
	public int get()
	{
		return age;
	}

	public void drive()
	{
		System.out.println("Parent class drive");
		
	}
	public void stop()
	{
		System.out.println("Parent class stop");
		
	}
public void horn()
{
	System.out.println("Parent class horn");
}
}
