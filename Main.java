package lab1;

public class Main {

	public static void main(String[] args) {
		
		Integer[] buffer = {1, 2, 3, 4, 5};
		// TODO Auto-generated method stub
		TimeHistory<Integer> th = new TimeHistory<Integer>("pralka", "Patka", 20180319, 1, "h", 1.2, buffer, 2.5);
		System.out.println (th.toString());
		buffer[3] = 0;
		Spectrum<Integer> sp = new Spectrum<Integer>("pralka", "Patka", 20180319,2, "Hz", 1.5, buffer, "liniowa");
		System.out.println (sp);
		
		Alarm al = new Alarm("Pralka", "Patka", 20180319, 4, 2, 1);
		System.out.println (al);		
	}
}
