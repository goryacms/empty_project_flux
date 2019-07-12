package ru.goryacms.office.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.goryacms.office.entity.Office;

public interface OfficeRepository extends ReactiveCrudRepository<Office, Long> {
}
