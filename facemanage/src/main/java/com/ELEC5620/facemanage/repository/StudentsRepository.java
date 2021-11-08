package com.ELEC5620.facemanage.repository;

import com.ELEC5620.facemanage.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {
}
