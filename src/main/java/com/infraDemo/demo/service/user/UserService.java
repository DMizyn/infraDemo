package com.infraDemo.demo.service.user;

import com.infraDemo.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final UserRepository repository;

    public User saveOne(User user){
        return repository.saveAndFlush(user);
    }

    public Optional<User> findById(Long id){
        return repository.findById(id);
    }
}

@Repository
interface UserRepository extends JpaRepository<User, Long>{
}
