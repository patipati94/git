package lab1;

public abstract class Sequence<T> extends Packet{
	protected int channelNr;
	protected String unit;
	protected double resolution;
	protected T[] buffer;
		
	public String bufferToString(){
		String result = new String();
		for(T i : buffer){
			result += (" " + i.toString());			
		}
		return result;
	}
	public Sequence(String device, String description, long date, int channelNr, String unit, double resolution, T[] buffer){
		super (device, description, date);
		this.channelNr= channelNr;
		this.unit= unit;
		this.resolution= resolution;
		this.buffer= buffer;
		}
	
		public String toString (){
		return super.toString() + " channelNr: "+ this.channelNr +" unit: " + this.unit + " resolution: "+ this.resolution + " buffer: "+ bufferToString();
	}

}
