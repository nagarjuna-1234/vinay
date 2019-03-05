package MainExecution;

import com.encap.B;


public class BExecution {
	public static void main(String[] args) {
		B m=new B();
		m.setI(78);
		m.setJ(98);
		int i=m.getI();
		int j=m.getJ();
		m.addresult(i, j);
		m.subresult(i, j);
		
	}

}

