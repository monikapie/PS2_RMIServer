package rmi;

import rmi.animal.AnimalRepository;
import rmi.animal.AnimalRepositoryImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args){

//        System.setProperty("java.rmi.server.hostname", "192.168.75.128");
        System.setProperty("java.rmi.server.hostname", "192.168.165.114");
        try {
            AnimalRepository repository = new AnimalRepositoryImpl();
            AnimalRepository animalRepository = (AnimalRepository) UnicastRemoteObject.exportObject(repository, Registry.REGISTRY_PORT);
            Registry registry2 = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            registry2.rebind("Animal", animalRepository);
            System.out.println("AnimalRepository is bound.");
        } catch (RemoteException e) {
            System.out.println("AnimalRepository is not bound. RemoteException appeared: " + e.toString());
        }
    }
}
