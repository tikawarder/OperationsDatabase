package com.epam.database.repository;

import com.epam.database.entity.ReportMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationsRepository extends JpaRepository<ReportMovement, Long> {
}
