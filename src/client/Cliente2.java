package client;

import java.rmi.Naming;

import server.InterfaceRC;

public class Cliente2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			InterfaceRC rc = (InterfaceRC) Naming.lookup("//localhost/ImplementaRC");
				System.out.println("Server Found!");
			rc.entrarRC("2");
			Thread.sleep(20000);
			
			rc.liberarRC("2");
	
			
		}catch (Exception e){}

	}

}
