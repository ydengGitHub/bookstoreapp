package com.bookstore.repository;

import com.bookstore.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by YAN on 3/4/17.
 */

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
