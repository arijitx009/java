
 class Vehicle {

	 	private double currentSpeed;
	 	private double currentDirection;
	 	private String ownername;
	 	private static int highestvehicleidentificationnumber;
	 	private int vehicleID;
	 	private static final int Turn_left=90 ;
	 	private static final int Turn_right=-90 ;
	 	
	 	Vehicle()
	 	{}
	 	
	 	Vehicle(String ownername)
	 	{
	 		this.ownername=ownername;
	 		
	 	}

		public int getVehicleID() {
			return vehicleID;
		}

		public void setVehicleID(int vehicleID) {
			this.vehicleID = vehicleID;
		}

		public double getCurrentSpeed() {
			return currentSpeed;
		}

		public void setCurrentSpeed(double currentSpeed) {
			this.currentSpeed = currentSpeed;
		}

		public double getCurrentDirection() {
			return currentDirection;
		}

		public void setCurrentDirection(double currentDirection) {
			this.currentDirection = currentDirection;
		}
	 	void changeSpeed(double speed)
	 	{
	 		
	 	this.currentSpeed=speed;
	 	}
	 	void stop()
	 	{
	 		this.currentSpeed=0;
	 	}
	 	void turn(double degree,String direction)
	 	
	 	{
	 		if(direction.equals("left"))
	 		currentDirection+=degree;
	 		if(direction.equals("right"))
		 		currentDirection-=degree;
	 		
	 	}
	 	void turndirection(String direction)
	 	{
	 		if(direction.equals("left"))
	 			currentDirection+=Turn_left;
	 		if(direction.equals("right"))
	 			currentDirection+=Turn_left;
	 	}

		public static int getHighestvehicleidentificationnumber() {
			return highestvehicleidentificationnumber;
		}

		public static void setHighestvehicleidentificationnumber(int highestvehicleidentificationnumber) {
			Vehicle.highestvehicleidentificationnumber = highestvehicleidentificationnumber;
			
			
		}
	 	
	 
}
 
 
 
 
 

