package lab1;

public class Alarm extends Packet{
	
	public int channelNr;
	public int threshold;
	public int direction;
	
	public Alarm (String device, String description, long date,int channelNr, int threshold, int direction){
		super(device, description, date);
		this.channelNr= channelNr;
		this.threshold= threshold;
		this.direction= direction;
	}
	public String toString (){
		return super.toString() + " channelNr: "+ this.channelNr +" threshold: " + this.threshold + " direction: "+ this.direction;
	}			

}
