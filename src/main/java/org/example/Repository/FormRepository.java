package org.example.Repository;

import org.example.Entity.FormEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<FormEntity,Long> {

}
