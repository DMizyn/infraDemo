package com.infraDemo.demo.service.user;

import com.infraDemo.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EvilService {

    private final UserRepository repository;

    public User findById(Long id) throws Exception {
        User tmp = repository.findById(id).orElseThrow(() -> new Exception("Person don't exist"));
        repository.deleteById(id);
        return tmp;
    }

}
