package com.team.domain.repository;

import com.team.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by BLACK on 2017/3/26.
 */
public interface UserRepository extends JpaRepository<User,String> {

}
