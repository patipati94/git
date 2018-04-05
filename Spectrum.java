package lab1;

public class Spectrum<T> extends Sequence<T>{
	public String scaling;
	
	public Spectrum(String device, String description, long date, int channelNr, String unit, double resolution,T[] buffer, String scaling){
		super (device, description, date, channelNr, unit, resolution, buffer);
		this.scaling= scaling;
	}
	public String toString (){
		return super.toString() + " scaling: "+ this.scaling;
	}
	}
