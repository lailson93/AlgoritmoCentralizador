package server;

import java.rmi.Naming;

public class Servidor {
	Servidor(){
		try{
			InterfaceRC rc = new ImplementaRC();
			Naming.rebind("//localhost/ImplementaRC", rc);
			System.out.println("Server is REady!");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String [] args){
		new Servidor();
	}
}
