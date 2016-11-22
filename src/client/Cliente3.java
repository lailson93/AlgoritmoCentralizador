package client;

import java.rmi.Naming;
import java.util.Random;

import server.InterfaceRC;

public class Cliente3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random geraId = new Random();
		
		try{
			String id;
			InterfaceRC rc = (InterfaceRC) Naming.lookup("//localhost/ImplementaRC");
				System.out.println("Server Found!");
			id = Integer.toString(geraId.nextInt());
			rc.entrarRC("3");
			Thread.sleep(20000);
			rc.liberarRC("3");
	
			
		}catch (Exception e){}

	}

}
