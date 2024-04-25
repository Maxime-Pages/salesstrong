package aik.sales.salesstrong.services;

import aik.sales.salesstrong.models.User;
import aik.sales.salesstrong.models.Buyer;
import aik.sales.salesstrong.models.Seller;
import aik.sales.salesstrong.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Seller createSeller(Seller user) {
        return userRepository.save(user);
    }

    public Buyer createBuyer(Buyer user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}