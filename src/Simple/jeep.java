package Simple;

public class jeep extends Vehicle{

	public String name="Rohan";
	 public String mobileno="9606157371";
		
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


	public static void main(String[] args) {
	//jeep j=new Vehicle(); /*not allowed*/
		Vehicle v=new jeep();
		
		// Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
		jeep j=(jeep)v;//
		j.drive();
		j.stop();
		j.music();
		j.music();
		j.horn();
		System.out.println(j.name);//prints child name since overriden
		System.out.println(j.address);//prints parent address as its not overridden by child
		System.out.println(j.mobileno);//prints child mobile as not present in parent
		

}
}
