package br.com.projeto.projeto_Web.repositories;

import br.com.projeto.projeto_Web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
