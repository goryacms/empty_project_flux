package ru.goryacms.user.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import ru.goryacms.user.entity.User;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
    // Not supported
//    @Query(value = "SELECT id, first_name, last_name, middle_name, position, phone, age, is_identified, " +
//            "registration_date, salary, office_id " +
//            "FROM users WHERE office_id=:officeId")
//    Flux<User> findByOfficeId(Long officeId);
}
