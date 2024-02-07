package ro.ubb.soa.eflocea.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubb.soa.eflocea.model.ChainsawStoreOrder;
import ro.ubb.soa.eflocea.repository.OrderItemRepository;
import ro.ubb.soa.eflocea.repository.OrderRepository;
import ro.ubb.soa.eflocea.services.interfaces.OrderServiceInterface;

import java.util.List;

@Service
public class OrderService implements OrderServiceInterface {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<ChainsawStoreOrder> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public void saveOrder(ChainsawStoreOrder chainsawStoreOrder) {
        orderItemRepository.save(chainsawStoreOrder.getItems());
        orderRepository.save(chainsawStoreOrder);
    }
}
