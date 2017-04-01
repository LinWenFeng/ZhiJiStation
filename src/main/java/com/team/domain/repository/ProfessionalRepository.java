package com.team.domain.repository;

import com.team.domain.entity.Professional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by BLACK on 2017/3/29.
 */
public interface ProfessionalRepository extends JpaRepository<Professional,String> {
}
