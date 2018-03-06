package rmi.animal;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by pietyszukm on 06.03.2018.
 */
public interface AnimalRepository extends Remote{
    List<Animal> findAll() throws RemoteException;
}
