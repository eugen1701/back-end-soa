package ro.ubb.soa.eflocea.services.interfaces;

import org.springframework.stereotype.Service;
import ro.ubb.soa.eflocea.model.ChainsawStoreOrder;

import java.util.List;

@Service
public interface OrderServiceInterface {

    List<ChainsawStoreOrder> getAllOrders();

    void saveOrder(ChainsawStoreOrder chainsawStoreOrder);
}
