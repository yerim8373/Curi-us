package com.ssafy.metroverse.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssafy.metroverse.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
