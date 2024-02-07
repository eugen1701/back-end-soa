package ro.ubb.soa.eflocea.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubb.soa.eflocea.model.ChainsawStore;
import ro.ubb.soa.eflocea.repository.ChainsawStoreRepository;
import ro.ubb.soa.eflocea.services.interfaces.ChainsawStoreServiceInterface;

import java.util.List;

@Service
public class ChainsawStoreService implements ChainsawStoreServiceInterface {
    private final ChainsawStoreRepository chainsawStoreRepository;

    @Autowired
    public ChainsawStoreService(ChainsawStoreRepository chainsawStoreRepository) {
        this.chainsawStoreRepository = chainsawStoreRepository;
    }

    @Override
    public List<ChainsawStore> getAllChainsawStores() {
        return chainsawStoreRepository.getAllChainsawStores();
    }

    @Override
    public ChainsawStore getChainsawStoreById(String id) {
        return chainsawStoreRepository.getChainsawStoreById(id).get();
    }
}
