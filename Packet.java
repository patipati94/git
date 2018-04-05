package lab1;
import java.io.Serializable;

public abstract class Packet implements Serializable{

	protected String device;
	protected String description;
	protected long date;

	public Packet(String device, String description, long date) {
		this.device= device;
		this.description= description;
		this.date= date;
		}

		public String toString (){
		return "device: "+ this.device +" description: " + this.description + " date: "+ this.date;
	}
}
