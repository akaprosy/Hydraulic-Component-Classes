
public class Pump {
	double pressure;
	double caseDrain;
	double displacement;
	double rpm;
	
	public Pump(double pressure, double caseDrain, double displacement, double rpm) {
		this.pressure = pressure;
		this.caseDrain = caseDrain;
		this.displacement = displacement;
		this.rpm = rpm;
	}
	public void pressure() {
		System.out.println("Pressure equals: " + pressure);
}
	public double flow() {
		double flow = (displacement*rpm)/231;
		return flow;
	}
	
	public double horsepower() {
		double flowHP = flow();
		double horsePower = (pressure*flowHP)/1714;
		return horsePower;
	}
	//variable output is the actual flow measured with a flow meter(outside the program)
	public double pumpEfficiency(double output) {
		double VolEfficiency = ((output*231)/(displacement*rpm))*100;
		return VolEfficiency;
	}
}
