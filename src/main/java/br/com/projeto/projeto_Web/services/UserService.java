package br.com.projeto.projeto_Web.services;

import br.com.projeto.projeto_Web.entities.User;
import br.com.projeto.projeto_Web.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
    public User findById(long id) {
       Optional<User> obj = repository.findById(id);
       return obj.get();
    }
    public User insert(User obj) {
      return  repository.save(obj);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public User updated(Long id, User obj) {
        User entity = repository.getReferenceById(id);
        updatedData(entity,obj);
        return repository.save(entity);
    }

    private void updatedData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
