package com.dio.sistemacontrolede.pontoeacesso.repository;

import com.dio.sistemacontrolede.pontoeacesso.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryJourney extends JpaRepository<WorkingDay, Long> {
}