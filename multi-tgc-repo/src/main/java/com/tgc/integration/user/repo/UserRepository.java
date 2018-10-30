package com.tgc.integration.user.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tgc.integration.user.User;
 
public interface UserRepository extends JpaRepository<User,String> {
}