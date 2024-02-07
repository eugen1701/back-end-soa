package ro.ubb.soa.eflocea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ubb.soa.eflocea.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
}
