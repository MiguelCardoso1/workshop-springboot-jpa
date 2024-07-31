package br.com.projeto.projeto_Web.repositories;

import br.com.projeto.projeto_Web.entities.OrderItem;
import br.com.projeto.projeto_Web.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
