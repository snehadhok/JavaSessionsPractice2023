package Inheritance;

public class Max extends Hospital {
	@Override
	public void opdservice(){
		System.out.println("opd timing is 11 to 2");
	}
	@Override
	public void xray(){
		System.out.println("xray service is available");
	}
	public void neuroservice(){
		System.out.println("neuroservice service is available");
	}
	
	

}
