package ro.ubb.soa.eflocea.services.interfaces;

import org.springframework.stereotype.Service;
import ro.ubb.soa.eflocea.model.ChainsawStore;

import java.util.List;

@Service
public interface ChainsawStoreServiceInterface {
    public List<ChainsawStore> getAllChainsawStores();

    public ChainsawStore getChainsawStoreById(String id);

}
