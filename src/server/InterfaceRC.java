package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceRC extends Remote {
	public void entrarRC (String id) throws RemoteException;
	public void liberarRC (String id) throws RemoteException;

}
