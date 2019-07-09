package ru.goryacms.user.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.goryacms.user.entity.User;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {

}
