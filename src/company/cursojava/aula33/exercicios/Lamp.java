package company.cursojava.aula33.exercicios;

public class Lamp {
	// Create a lamp class, develop methods to turn on and turn off.
	boolean isTurnedOn;
	String type, lightColor;
	short lumens, watts, volts, luminousEfficiency;
	
	Lamp(){}

	public Lamp(String type, short watts, short volts) {
		this.type = type;
		this.watts = watts;
		this.volts = volts;
	}
	
	public Lamp(boolean isTurnedOn, String type, short lumens, String lightColor, short watts, short volts) {
		this(type, watts, volts);
		this.isTurnedOn = isTurnedOn;
		this.lumens = lumens;
		this.lightColor = lightColor;
		this.setLuminousEfficiency();
	}

	public Lamp(boolean isTurnedOn, String type, short lumens, String lightColor, short watts, short volts,
			short luminousEfficiency) {
		this(isTurnedOn, type, lumens, lightColor, watts, volts);
		this.luminousEfficiency = luminousEfficiency;
	}

	private void setTurnedOn(boolean isTurnedOn) {
		this.isTurnedOn = isTurnedOn;
	}

	private void setType(String type) {
		this.type = type;
	}

	private void setLumens(short lumens) {
		this.lumens = lumens;
	}

	private void setLightColor(String lightColor) {
		this.lightColor = lightColor;
	}

	private void setWatts(short watts) {
		this.watts = watts;
	}

	private void setVolts(short volts) {
		this.volts = volts;
	}

	private void setLuminousEfficiency(short luminousEfficiency) {
		this.luminousEfficiency = luminousEfficiency;
	}
	
	private void setLuminousEfficiency() {
		this.luminousEfficiency = (short) (this.lumens / this.watts);
	}

	public boolean isTurnedOn() {
		return isTurnedOn;
	}

	public String getType() {
		return type;
	}

	public short getLumens() {
		return lumens;
	}

	public String getLightColor() {
		return lightColor;
	}

	public short getWatts() {
		return watts;
	}

	public short getVolts() {
		return volts;
	}

	public short getLuminousEfficiency() {
		return luminousEfficiency;
	}
	
	public void turnOn() {
		setTurnedOn(true);
	}
	public void turnOff() {
		setTurnedOn(false);
	}
	
	
	public static void main(String[] args) {
		Lamp lamp = new Lamp("Incandescente", (short)12, (short)110);
		lamp.turnOn();
		System.out.println(lamp.isTurnedOn);
		lamp.turnOff();
		System.out.println(lamp.isTurnedOn);
	}
}
