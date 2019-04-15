package com.employee.management;

import com.employee.management.io.entity.EmployerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends CrudRepository<EmployerEntity, Long> {
}
