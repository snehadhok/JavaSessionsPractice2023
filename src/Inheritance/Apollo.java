package Inheritance;

public class Apollo extends Hospital {
	@Override
	public void opdservice(){
		System.out.println("opd timing is 11 to 2");
	}
	@Override
	public void xray(){
		System.out.println("xray service is available");
	}
	public void cardioservice(){
		System.out.println("cardioservice service is available");
	}
	

}
