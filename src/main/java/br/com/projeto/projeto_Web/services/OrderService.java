package br.com.projeto.projeto_Web.services;

import br.com.projeto.projeto_Web.entities.Category;
import br.com.projeto.projeto_Web.entities.Order;
import br.com.projeto.projeto_Web.repositories.CategoryRepository;
import br.com.projeto.projeto_Web.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private CategoryRepository repository;


    public List<Category> findAll() {
        return repository.findAll();
    }
    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
