package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ImplementaRC extends UnicastRemoteObject implements InterfaceRC  {
	private ArrayList<String> clientes;
	boolean token;	
	
	protected ImplementaRC() throws RemoteException {
		super();
		clientes = new ArrayList<String>();
		token = false;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2356778654596315164L;

	
	@Override
	public void entrarRC(String id) throws RemoteException{
		// TODO Auto-generated method stub
		
		this.clientes.add(id);
		if(token == false){
			System.out.println("Cliente "+id+" encontra-se na RC");
			token = true;
		}else{
			System.out.println("A RC encontra-se ocupada!");
			
		}
	}

	@Override
	public void liberarRC(String id) throws RemoteException {
		// TODO Auto-generated method stub
		if (this.clientes.get(0).equals(id)){
			System.out.println("O cliente "+id+" saiu da RC");
			token = false;
			this.clientes.remove(0);
			
			if (clientes.isEmpty()){
				System.out.println("Nenhum cliente em espera!");
			}
			else{
				System.out.println("Cliente "+this.clientes.get(0)+" encontra-se na RC");
				token = true;
			}
		}else{
			System.out.println("O cliente "+id+" nao esta na RC");
			
		}
	}
}
