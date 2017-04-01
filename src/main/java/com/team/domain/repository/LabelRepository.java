package com.team.domain.repository;

import com.team.domain.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LWF on 2017/3/29.
 */
public interface LabelRepository extends JpaRepository<Label,String> {
}
