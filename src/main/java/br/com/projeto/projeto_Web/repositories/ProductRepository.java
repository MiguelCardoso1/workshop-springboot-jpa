package br.com.projeto.projeto_Web.repositories;

import br.com.projeto.projeto_Web.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
