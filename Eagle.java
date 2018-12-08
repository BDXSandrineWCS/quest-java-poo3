public class Eagle extends Bird implements Fly {

	private boolean flying;
	private int altitude;

	public Eagle(String name) {
		super(name);
		this.flying = false;
		this.altitude = 0;
	}

	public int getAltitude() {
		return altitude;
	}

	public boolean isFlying() {
		return flying;
	}

	@Override
	public String sing() {
		return "Screech!";
	}

	@Override
	public void takeOff(){
		if (!this.flying && this.altitude == 0) {
			this.flying = true;
			System.out.printf("%s take off to the sky.%n", this.getName());
		} else {
			if (this.flying) {
				System.out.printf("%s can't take off, since it's already flying!%n", this.getName());
			} else {
				System.out.printf("%s can't take off,since it's already in the sky.%n", this.getName());
			}	
		}		
	}

	@Override
	public int ascend(int meters){
		if (this.flying) {
			this.altitude = Math.max(this.altitude + meters, 0);
			System.out.printf("%s fly higher, altitude : %d%n", this.getName(), this.altitude);
        	} else {
			System.out.printf("%s is flying, altitude : %d%n", this.getName(), this.altitude);
		}
        	return this.altitude;
	}

	@Override
	public int descend(int meters){
		if (this.flying) {
			this.altitude = Math.max(this.altitude - meters, 0);
			System.out.printf("%s fly lower, altitude : %d%n", this.getName(), this.altitude);
        	} else {
			System.out.printf("%s is flying, altitude : %d%n", this.getName(), this.altitude);
		}
        	return this.altitude;

	}

	@Override
	public void land(){
		if (this.flying && this.altitude == 0) {
			System.out.printf("%s land on the ground.%n", this.getName());
		} else {
			if (this.flying) {
				System.out.printf("%s will crash, it can't land!%n", this.getName());
			} else {
				System.out.printf("%s can't land, since it's already on the ground!%n", this.getName());
			}
		}
	}

}
