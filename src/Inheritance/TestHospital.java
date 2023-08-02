package Inheritance;

public class TestHospital {

	public static void main(String[] args) {
		Hospital hos = new Hospital();
		Apollo ap = new Apollo();
		Fortis fo = new Fortis();
		Max mx = new Max();
		hos.opdservice();
		ap.cardioservice();
		fo.physioservice();
		mx.neuroservice();
		//topcasting
		Hospital hos1= new Apollo();
		hos1.opdservice();
		Hospital fo1 = new Fortis();
		fo1.opdservice();
		Hospital mx1 = new Max();
		mx1.sonography();
		//downcasting
	//Apollo ap1= (Apollo) new Hospital();
	//ap1.cardioservice();
	
				
		
	}

}
