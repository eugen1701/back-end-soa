package ro.ubb.soa.eflocea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ro.ubb.soa.eflocea.model.ChainsawStoreOrder;

import java.util.List;

public interface OrderRepository extends JpaRepository<ChainsawStoreOrder, String> {

    @Query("SELECT o FROM ChainsawStoreOrder o")
    List<ChainsawStoreOrder> getAllOrders();
}
