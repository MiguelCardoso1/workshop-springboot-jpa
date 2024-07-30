package br.com.projeto.projeto_Web.repositories;

import br.com.projeto.projeto_Web.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
