package ro.ubb.soa.eflocea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ro.ubb.soa.eflocea.model.ChainsawStore;

import java.util.List;
import java.util.Optional;

public interface ChainsawStoreRepository extends JpaRepository<ChainsawStore, String> {
    @Query("SELECT s FROM ChainsawStore s")
    List<ChainsawStore> getAllChainsawStores();

    @Query("SELECT store from ChainsawStore store WHERE store.chainsawStoreId = ?1")
    Optional<ChainsawStore> getChainsawStoreById(String id);
}
