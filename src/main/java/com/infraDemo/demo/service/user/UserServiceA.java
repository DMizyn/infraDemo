package com.infraDemo.demo.service.user;

import com.infraDemo.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@ConditionalOnProperty(
        value = "service.user",
        havingValue = "A"
)
public class UserServiceA implements UserService {

    private final UserRepository repository;

    @Override
    public User saveOne(User user) {
        return repository.saveAndFlush(user);
    }

    @Override
    public boolean deleteUserById(long id) throws Exception {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
}

